plugins {
    kotlin("jvm") version "1.9.25"
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(17)
    }
}

repositories {
    mavenCentral()
}

dependencies{
    implementation("org.postgresql:postgresql:42.2.23")
    implementation(kotlin("reflect"))
}