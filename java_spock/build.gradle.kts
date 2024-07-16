plugins {
    id("java")
    id("groovy")
}

group = "ptv.dojo"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    // TEST SCOPE
    testImplementation("org.spockframework:spock-core:2.4-M4-groovy-4.0")
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}

sourceSets {
    test {
        groovy.srcDir("src/test/groovy")
    }
}
