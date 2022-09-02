plugins {
	application
}

application {
	mainClass.set("com.cayena.auth.api.AuthApiApplication")
}

dependencies {
	implementation(project(":auth-domain"))
	implementation("org.springframework.boot:spring-boot-starter-web")
}