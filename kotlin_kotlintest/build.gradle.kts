plugins {
    val kotlinPluginVersion = "1.9.24"

    kotlin("jvm") version kotlinPluginVersion
    id("io.kotlintest") version "1.1.1"
}

group = "ptv.dojo"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.8.21")

    // TEST SCOPE
    testImplementation("io.kotest:kotest-runner-junit5:5.6.2")
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }
}


kotlin {
    jvmToolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}

sourceSets {
    main {
        kotlin.srcDir("src/main/kotlin")
    }
    test {
        kotlin.srcDir("src/test/kotlin")
    }
}
