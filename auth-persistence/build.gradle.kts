import org.springframework.boot.gradle.tasks.bundling.BootJar

plugins {
	id("org.flywaydb.flyway") version "8.2.0"
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-data-jpa")
	implementation("org.springframework.boot:spring-boot-starter-validation")
	runtimeOnly("mysql:mysql-connector-java")
}

flyway {
	url = "jdbc:mysql://localhost:3306/auth_dev?allowPublicKeyRetrieval=true&createDatabaseIfNotExist=true&useSSL=false&useTimezone=true&serverTimezone=UTC"
	user = "root"
	password = "12345678"
	locations = arrayOf("filesystem:src/main/resources/flyway")
}

tasks.withType<BootJar> {
	enabled = false
}

tasks.jar {
	enabled = true
}