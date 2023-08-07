plugins {
    id("com.android.application")
    kotlin("android")
//    kotlin("kapt")
    id("androidx.navigation.safeargs")
}

android {
    compileSdk = 34
    defaultConfig {
        applicationId = "com.robertlevonyan.demo.camerax"
        minSdk = 21
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = true
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    buildFeatures {
        viewBinding = true
    }
    namespace = "com.robertlevonyan.demo.camerax"
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.1")

    implementation("com.google.android.material:material:1.9.0")

    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("androidx.core:core-ktx:1.10.1")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("androidx.camera:camera-core:1.3.0-beta02")
    implementation("androidx.camera:camera-camera2:1.3.0-beta02")
    implementation("androidx.camera:camera-lifecycle:1.3.0-beta02")
    implementation("androidx.camera:camera-extensions:1.3.0-beta02")
    implementation("androidx.camera:camera-view:1.3.0-beta02")
    implementation("androidx.fragment:fragment:1.6.1")
    implementation("androidx.fragment:fragment-ktx:1.6.1")
    implementation("androidx.navigation:navigation-fragment-ktx:2.6.0")
    implementation("androidx.navigation:navigation-ui-ktx:2.6.0")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.6.1")
    implementation("androidx.viewpager2:viewpager2:1.0.0")

    implementation("io.coil-kt:coil:2.3.0")
    implementation("io.coil-kt:coil-video:2.3.0")
}
