import org.springframework.boot.gradle.tasks.bundling.BootJar
import org.flywaydb.gradle.task.FlywayMigrateTask

plugins {
    id("org.flywaydb.flyway") version "8.2.0"
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.springframework.boot:spring-boot-starter-validation")
    runtimeOnly("mysql:mysql-connector-java")
}

tasks.register("database_flyway", FlywayMigrateTask::class) {
    if (!project.hasProperty("url")) throw StopExecutionException("Args url is mandatory")
    if (!project.hasProperty("user")) throw StopExecutionException("Args user is mandatory")
    if (!project.hasProperty("password")) throw StopExecutionException("Args password is mandatory")
    if (!project.hasProperty("locations")) throw StopExecutionException("Args locations is mandatory")
    url = project.property("url").toString()
    user = project.property("user").toString()
    password = project.property("password").toString()
    locations = arrayOf("filesystem:" + project.property("locations").toString())
}

tasks.withType<BootJar> {
    enabled = false
}

tasks.jar {
    enabled = true
}