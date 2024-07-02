plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.high-mobility:hmkit-utils:1.4.5")
    implementation("com.high-mobility:hmkit-auto-api:3.12.0")
    implementation("com.high-mobility:hmkit-crypto-telematics:0.1")
    implementation("org.slf4j:slf4j-simple:1.7.32")
}
