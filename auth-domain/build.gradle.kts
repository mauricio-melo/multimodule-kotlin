import org.springframework.boot.gradle.tasks.bundling.BootJar

dependencies {
	// Module Persistence
	implementation(project(":auth-persistence"))

	implementation("org.springframework.boot:spring-boot-starter-web")
}

tasks.withType<BootJar> {
	enabled = false
}

tasks.jar {
	enabled = true
}