plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = Deps.Congif.nameSpace
    compileSdk = Deps.Congif.compileSdk

    defaultConfig {
        applicationId = Deps.Congif.nameSpace
        minSdk = Deps.Congif.minSdk
        targetSdk = Deps.Congif.targetSdk
        versionCode = Deps.Congif.versionCode
        versionName = Deps.Congif.versionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }
    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = Deps.AndroidX.Compose.composeVersion
    }
    packagingOptions {
        resources {
            excludes.add("/META-INF/{AL2.0,LGPL2.1}")
        }
    }
}

dependencies {
    implementation(Deps.AndroidX.lifecycle)
    implementation(Deps.AndroidX.activity)

    implementation(project(Deps.Modules.commonUi))
    implementation(project(Deps.Modules.model))
    implementation(project(Deps.Modules.ui))
    implementation(project(Deps.Modules.data))
    implementation(project(Deps.Modules.domain))
}