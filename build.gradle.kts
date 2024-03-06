import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	id("org.springframework.boot") version "2.7.0"
	id("io.spring.dependency-management") version "1.0.11.RELEASE"
	kotlin("jvm") version "1.6.21"
	kotlin("plugin.spring") version "1.6.21"
	kotlin("plugin.jpa") version "1.6.21"
}

group = "com.espacosabrina"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_17

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-data-jpa")
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
	implementation("org.jetbrains.kotlin:kotlin-reflect")
	implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
	runtimeOnly("org.postgresql:postgresql")
//  wiremock
	testImplementation("com.github.tomakehurst:wiremock-jre8:2.35.0")
//	testImplementation("com.h2database:h2:1.3.148")
	testImplementation("org.springframework.boot:spring-boot-starter-test")

//	cors
	testImplementation( "org.apache.httpcomponents:httpclient")

	// https://mvnrepository.com/artifact/org.hibernate/hibernate-entitymanager
	implementation("org.hibernate:hibernate-entitymanager:5.6.15.Final")

	// https://mvnrepository.com/artifact/org.hibernate/hibernate-core
	implementation("org.hibernate:hibernate-core:5.6.15.Final")


// flyway
//	implementation("org.flywaydb:flyway-core:7.7.0")



}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs = listOf("-Xjsr305=strict")
		jvmTarget = "17"
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}
