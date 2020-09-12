plugins {
    kotlin("jvm") version "1.4.10"
    application
}

group="org.example"
version="1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

sourceSets.main {
    java {
        setSrcDirs(listOf("src"))
    }
}

application {
    mainClassName = "ApplicationKt"
}

dependencies {
    implementation(kotlin("stdlib"))
}
