plugins {
	java
	id("org.springframework.boot") version "3.5.3"
	id("io.spring.dependency-management") version "1.1.7"
}

group = "vn.edu.ptit.duongvct.practice1.socialmedia"
version = "0.0.1-SNAPSHOT"

java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(21)
	}
}

configurations {
	compileOnly {
		extendsFrom(configurations.annotationProcessor.get())
	}
}

repositories {
	mavenCentral()
}
//extra["springCloudVersion"] = "2025.0.0"
//extra["otelVersion"] = "2.17.0";
val modelMapperVersion = "3.2.4";
val openApiWebUIVersion = "2.8.9";
dependencies {
	implementation("org.springframework.boot:spring-boot-starter-actuator")
//	implementation("org.springframework.cloud:spring-cloud-starter-netflix-eureka-client")
//	implementation("org.springframework.cloud:spring-cloud-starter-config")
	implementation("org.springframework.boot:spring-boot-starter-data-mongodb")
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("org.springframework.boot:spring-boot-starter-validation")
	implementation("org.modelmapper:modelmapper:${modelMapperVersion}")
	implementation("org.springframework.boot:spring-boot-starter-validation")
	implementation("org.springdoc:springdoc-openapi-starter-webmvc-ui:${openApiWebUIVersion}")
//	implementation("org.springframework.cloud:spring-cloud-starter-circuitbreaker-resilience4j")
	compileOnly("org.projectlombok:lombok")
//	runtimeOnly("io.micrometer:micrometer-registry-prometheus")
//	runtimeOnly("io.opentelemetry.javaagent:opentelemetry-javaagent:${property("otelVersion")}")
	developmentOnly("org.springframework.boot:spring-boot-devtools")
	annotationProcessor("org.projectlombok:lombok")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}
//dependencyManagement {
//	imports {
//		mavenBom("org.springframework.cloud:spring-cloud-dependencies:${property("springCloudVersion")}")
//	}
//}
tasks.withType<Test> {
	useJUnitPlatform()
}
