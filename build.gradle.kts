plugins {
    kotlin("jvm") version "1.9.0"
}

group = "org.bukkitstom"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven {
        name = "bukkitstomMinestom"
        url = uri("http://192.168.10.41:25569/minestom")
        isAllowInsecureProtocol = true
    }

}

dependencies {
    compileOnly("com.github.Minestom.Minestom:Minestom:3645d4311d")
}

kotlin {
    jvmToolchain(17)
}