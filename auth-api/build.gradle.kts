plugins {
	application
}

application {
	mainClass.set("com.cayena.auth.api.AuthApiApplication")
}

dependencies {
	implementation(project(":auth-domain"))
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("org.mapstruct:mapstruct:1.5.2.Final")
	kapt("org.mapstruct:mapstruct-processor:1.5.2.Final")
}


kapt {
	arguments {
		arg("mapstruct.defaultComponentModel", "spring")
	}
}