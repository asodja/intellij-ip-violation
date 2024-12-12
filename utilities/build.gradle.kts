plugins {
    id("org.jetbrains.kotlin.jvm") version "2.1.0"
}

repositories {
    mavenCentral()
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}