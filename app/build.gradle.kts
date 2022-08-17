
plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
    id("com.google.devtools.ksp") version "1.7.10-1.0.6"
    id("dev.rikka.tools.refine") version "3.1.1"
}

android {
    compileSdk = 32

    defaultConfig {
        applicationId = "fivecc.yukihook.demo"
        minSdk = 30
        targetSdk = 32
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        debug {
            applicationIdSuffix = ".debug"
        }
        release {
            isMinifyEnabled = true
            isShrinkResources = true
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
}

dependencies {
    implementation("androidx.core:core-ktx:1.8.0")
    // Xposed API
    compileOnly("de.robv.android.xposed:api:82")
    compileOnly("de.robv.android.xposed:api:82:sources")
    val yukiHookVersion: String by rootProject.extra
    implementation("com.highcapable.yukihookapi:api:$yukiHookVersion")
    ksp("com.highcapable.yukihookapi:ksp-xposed:$yukiHookVersion")
}