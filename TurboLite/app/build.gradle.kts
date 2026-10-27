plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.vnsants.turbolite"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.vnsants.turbolite"
        minSdk = 26
        targetSdk = 28
        versionCode = 1
        versionName = "0.1-beta"
    }
}

dependencies {
    implementation("dev.rikka.shizuku:api:13.1.5")
    implementation("dev.rikka.shizuku:provider:13.1.5")
}
