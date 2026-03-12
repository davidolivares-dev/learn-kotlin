plugins {
    kotlin("jvm") version "2.0.0" apply false
}

subprojects {
    apply(plugin = "org.jetbrains.kotlin.jvm")

    repositories {
        mavenCentral()
    }

    // Use the subproject directory itself as the source root,
    // so .kt files can live directly in exercises/ and project/
    // without needing src/main/kotlin/ subdirectories.
    the<org.jetbrains.kotlin.gradle.dsl.KotlinJvmProjectExtension>().sourceSets["main"].kotlin {
        srcDirs(".")
    }
}
