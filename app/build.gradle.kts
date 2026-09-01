plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.gkvg.calendar"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.gkvg.calendar"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"
    }
}

dependencies {
}
