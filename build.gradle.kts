import org.openapitools.generator.gradle.plugin.tasks.GenerateTask

plugins {
    java
    id("org.openapi.generator") version "5.3.0"
    idea
}
val GROUP = "io.cloudreactor.tasksymphony"

group = GROUP
version = "0.2.0-SNAPSHOT"

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
    testImplementation("org.apache.logging.log4j","log4j-core", "2.13.3")
    testImplementation("org.apache.logging.log4j","log4j-api", "2.13.3")
    testImplementation("org.apache.logging.log4j", "log4j-slf4j-impl", "2.13.3")

    // Needed to read log4j2 configuration in YML
    testImplementation("com.fasterxml.jackson.dataformat", "jackson-dataformat-yaml", LibraryVersions.jackson_version)
}

configure<JavaPluginExtension> {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

sourceSets {
    main {
        java.srcDir("build/generate-resources/main/src/main/java")
    }
    test {
        java.srcDir("build/generate-resources/main/src/test/java")
    }
}

tasks.withType<Test> {
    this.testLogging {
        this.showStandardStreams = true
    }
}

tasks.named<GenerateTask>("openApiGenerate") {
    generatorName.set("java")
    inputSpec.set("$rootDir/cloudreactor-openapi3.yml")
    apiPackage.set("$GROUP.api")
    invokerPackage.set("$GROUP.invoker")
    modelPackage.set("$GROUP.model")
    library.set("apache-httpclient")
    configOptions.set(mapOf(
        "dateLibrary" to "java8",
        "hideGenerationTimestamp" to "true"))
}

tasks.compileJava {
    dependsOn(tasks.named("openApiGenerate"))
}
