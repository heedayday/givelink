plugins {
	java
	id("org.springframework.boot") version "3.4.3"
	id("io.spring.dependency-management") version "1.1.7"
}

group = "com.java"
version = "0.0.1-SNAPSHOT"

java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(17)
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

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-data-jpa")
	implementation("org.springframework.boot:spring-boot-starter-thymeleaf")
	implementation("org.springframework.boot:spring-boot-starter-web")

	//JSP 사용을 위해 추가
	implementation("org.apache.tomcat.embed:tomcat-embed-jasper")
	//implementation("javax.servlet:jstl")
	implementation ("jakarta.servlet:jakarta.servlet-api") //스프링부트 3.0 이상
	implementation ("jakarta.servlet.jsp.jstl:jakarta.servlet.jsp.jstl-api") //스프링부트 3.0 이상
	implementation ("org.glassfish.web:jakarta.servlet.jsp.jstl") //스프링부트 3.0 이상

	compileOnly("org.projectlombok:lombok")
	runtimeOnly("com.h2database:h2")
	annotationProcessor("org.projectlombok:lombok")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.withType<Test> {
	useJUnitPlatform()
}
