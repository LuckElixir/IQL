plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation("org.jetbrains:annotations:24.0.0")
    implementation(fileTree("..\\MatrixProject\\out\\artifacts\\Matrices\\Matrices.jar"))
}

tasks.test {
    useJUnitPlatform()
}