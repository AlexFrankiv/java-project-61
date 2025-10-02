plugins {
    id("com.github.ben-manes.versions")
    application
    id("org.sonarqube") version "6.3.1.5724"
    checkstyle
}

group = "hexlet.code"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}
application {
    mainClass.set("hexlet.code.App")
}
sonar {
    properties {
        property("sonar.projectKey", "AlexFrankiv_java-project-61")
        property("sonar.organization", "alexfrankiv")
    }
}
checkstyle {
    toolVersion = "10.12.4"
}

tasks.getByName("run", JavaExec::class) {
    standardInput = System.`in`
}