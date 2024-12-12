plugins {
    id("org.jetbrains.kotlin.jvm") version "2.1.0"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":utilities"))
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}
