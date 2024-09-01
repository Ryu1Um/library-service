plugins {
    id("org.springframework.boot") version "3.3.2"
    id("io.spring.dependency-management") version "1.1.6"
    id("java")

}

repositories {
    mavenCentral()
}

object Versions {
    const val postgresql = "42.7.3";

    const val mapstruct = "1.5.5.Final"
    const val swagger = "2.6.0"
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.postgresql:postgresql:${Versions.postgresql}")

    implementation("org.springdoc:springdoc-openapi-starter-webmvc-ui:${Versions.swagger}")

    compileOnly("org.projectlombok:lombok")
    annotationProcessor("org.projectlombok:lombok")
    testCompileOnly("org.projectlombok:lombok")
    testAnnotationProcessor("org.projectlombok:lombok")

    implementation("org.mapstruct:mapstruct:${Versions.mapstruct}")
    annotationProcessor("org.mapstruct:mapstruct-processor:${Versions.mapstruct}")
    testAnnotationProcessor("org.mapstruct:mapstruct-processor:${Versions.mapstruct}")
}