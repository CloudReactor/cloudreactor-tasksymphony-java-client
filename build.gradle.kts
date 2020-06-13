plugins {
    java
}

group = "io.cloudreactor.tasksymphony"
version = "0.1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.fasterxml.jackson.core", "jackson-databind", "2.11.0")
    implementation("org.slf4j", "slf4j-api", "1.7.30")

    testImplementation("junit", "junit", "4.12")
    testImplementation("org.apache.logging.log4j","log4j-core", "2.13.3")
    testImplementation("org.apache.logging.log4j","log4j-api", "2.13.3")
    testImplementation("org.apache.logging.log4j", "log4j-slf4j-impl", "2.13.3")

    // Needed to read log4j2 configuration in YML
    testImplementation("com.fasterxml.jackson.dataformat", "jackson-dataformat-yaml", "2.11.0")
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
}

tasks.withType<Test> {
    this.testLogging {
        this.showStandardStreams = true
    }
}