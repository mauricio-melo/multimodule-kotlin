import org.springframework.boot.gradle.tasks.bundling.BootJar

plugins {
	application
}

application {
	mainClass.set("com.cayena.auth.api.AuthApiApplication")
}

dependencies {
	// Module Persistence
	implementation(project(":auth-domain"))

	implementation("org.springframework.boot:spring-boot-starter-web")
}

tasks.withType<BootJar> {
	enabled = false
}

tasks.jar {
	enabled = true
}