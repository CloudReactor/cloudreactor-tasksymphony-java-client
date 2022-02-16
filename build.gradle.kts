import java.util.Base64

import org.gradle.external.javadoc.CoreJavadocOptions

import org.openapitools.generator.gradle.plugin.tasks.GenerateTask

plugins {
    `java-library`
    id("org.openapi.generator") version "5.3.0"
    signing
    `maven-publish`
    id("io.github.gradle-nexus.publish-plugin") version "1.1.0"
    idea
}
val GROUP = "io.cloudreactor"
val ARTIFACT = "tasksymphony"
val PACKAGE = GROUP + "." + ARTIFACT
val VERSION = "0.2.2"

group = PACKAGE
version = VERSION

repositories {
    mavenCentral()
}

object LibraryVersions {
    const val swagger_annotations_version = "1.5.22"
    const val jackson_version = "2.12.1"
    const val jackson_databind_version = "2.10.5.1"
    const val jackson_databind_nullable_version = "0.2.1"
    const val jakarta_annotation_version = "1.3.5"
    const val httpclient_version = "4.5.13"
    const val junit_version = "4.13.1"
    const val log4j2_version = "2.15.0"
}

dependencies {
    implementation("com.fasterxml.jackson.core", "jackson-databind", LibraryVersions.jackson_version)
    implementation("org.slf4j", "slf4j-api", "1.7.30")

    implementation("io.swagger", "swagger-annotations", LibraryVersions.swagger_annotations_version)
    implementation("com.google.code.findbugs", "jsr305", "3.0.2")
    implementation("org.apache.httpcomponents", "httpclient", LibraryVersions.httpclient_version)
    implementation("org.apache.httpcomponents", "httpmime", LibraryVersions.httpclient_version)
    implementation("com.fasterxml.jackson.core", "jackson-core", LibraryVersions.jackson_version)
    implementation("com.fasterxml.jackson.core", "jackson-annotations", LibraryVersions.jackson_version)
    implementation("com.fasterxml.jackson.core", "jackson-databind", LibraryVersions.jackson_databind_version)
    implementation("com.fasterxml.jackson.jaxrs", "jackson-jaxrs-json-provider", LibraryVersions.jackson_version)
    implementation("org.openapitools", "jackson-databind-nullable", LibraryVersions.jackson_databind_nullable_version)
    implementation("com.fasterxml.jackson.datatype", "jackson-datatype-jsr310", LibraryVersions.jackson_version)
    implementation("jakarta.annotation", "jakarta.annotation-api", LibraryVersions.jakarta_annotation_version)
    
    testImplementation("junit", "junit", LibraryVersions.junit_version)
    testImplementation("org.apache.logging.log4j","log4j-core", LibraryVersions.log4j2_version)
    testImplementation("org.apache.logging.log4j","log4j-api", LibraryVersions.log4j2_version)
    testImplementation("org.apache.logging.log4j", "log4j-slf4j-impl", LibraryVersions.log4j2_version)

    // Needed to read log4j2 configuration in YML
    testImplementation("com.fasterxml.jackson.dataformat", "jackson-dataformat-yaml", LibraryVersions.jackson_version)
}

configure<JavaPluginExtension> {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

java {
    withSourcesJar()
    withJavadocJar()
}

sourceSets {
    main {
        java.srcDir("build/generate-resources/main/src/main/java")
    }
    test {
        java.srcDir("build/generate-resources/main/src/test/java")
    }
}

tasks.named<GenerateTask>("openApiGenerate") {
    generatorName.set("java")
    inputSpec.set("$rootDir/cloudreactor-openapi3.yml")
    apiPackage.set("$PACKAGE.api")
    invokerPackage.set("$PACKAGE.invoker")
    modelPackage.set("$PACKAGE.model")
    library.set("apache-httpclient")
    configOptions.set(mapOf(
        "dateLibrary" to "java8",
        "hideGenerationTimestamp" to "true"))
}

tasks.compileJava {
    dependsOn(tasks.named("openApiGenerate"))
}

tasks.named<Jar>("sourcesJar") {
    dependsOn(tasks.named("openApiGenerate"))
}

tasks.withType<Test> {
    this.testLogging {
        this.showStandardStreams = true
    }
}

tasks.register<Delete>("clearDocs") {
    this.delete("docs")
}

// Preserver CNAME in docs directory for GitHub Pages
tasks.register<Copy>("copyJavaDocCNAME") {
    this.from(File("JavaDoc-CNAME"))
    this.destinationDir = File("docs")
    this.rename { "CNAME" }
}

// Prepare to publish to GitHub Pages in docs directory
tasks.register<Copy>("copyDocs") {
    this.from(File("build/docs/javadoc"))
    this.destinationDir = File("docs")
    this.dependsOn(tasks.named("clearDocs"))
    this.finalizedBy(tasks.named("copyJavaDocCNAME"))
}

tasks.withType<Javadoc> {
    this.title = "CloudReactor API Client $VERSION"
    this.options {
        this as CoreJavadocOptions
        this.addStringOption("Xdoclint:-missing")
    }

    this.finalizedBy(tasks.named("copyDocs"))
}

fun base64Decode(prop: String): String? {
    return project.findProperty(prop)?.let {
        String(Base64.getDecoder().decode(it.toString())).trim()
    }
}

nexusPublishing {
    repositories {
        sonatype {
            nexusUrl.set(uri("https://s01.oss.sonatype.org/service/local/"))
            snapshotRepositoryUrl.set(uri("https://s01.oss.sonatype.org/content/repositories/snapshots/"))
        }
    }
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = GROUP
            artifactId = ARTIFACT
            version = VERSION
            from(components["java"])
            pom {
                name.set("CloudReactor Java API Client and Status Updater")
                description.set("API Client to monitor and manage CloudReactor Tasks and Workflows, and a status updater for processes run by a CloudReactor process wrapper.")
                url.set("https://github.com/CloudReactor/cloudreactor-tasksymphony-java-client")
                licenses {
                    license {
                        name.set("BSD 2-clause license")
                        url.set("https://opensource.org/licenses/BSD-2-Clause")
                    }
                }
                developers {
                    developer {
                        id.set("jtsay")
                        name.set("Jeff Tsay")
                        email.set("jeff@cloudreactor.io")
                        organization.set("CloudReactor")
                        organizationUrl.set("https://cloudreactor.io")
                    }
                }
                scm {
                    connection.set("scm:git://github.com:CloudReactor/cloudreactor-tasksymphony-java-client.git")
                    developerConnection.set("scm:git:ssh://github.com:CloudReactor/cloudreactor-tasksymphony-java-client.git")
                    url.set("https://github.com/CloudReactor/cloudreactor-tasksymphony-java-client")
                }
            }
        }
    }
}

signing {
    useInMemoryPgpKeys(base64Decode("signingKeyBase64"), project.findProperty("signingPassword").let { it.toString().trim() } )
    //sign(*publishing.publications.toTypedArray())
    sign(publishing.publications["maven"])
}
