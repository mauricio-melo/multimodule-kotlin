import org.springframework.boot.gradle.tasks.bundling.BootJar

dependencies {
	implementation(project(":auth-persistence"))
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("org.mapstruct:mapstruct:1.5.2.Final")
	kapt("org.mapstruct:mapstruct-processor:1.5.2.Final")
}


kapt {
	arguments {
		 arg("mapstruct.defaultComponentModel", "spring")
	}
}

tasks.withType<BootJar> {
	enabled = false
}

tasks.jar {
	enabled = true
}