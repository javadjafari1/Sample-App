plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "ir.javadjafarii.commonui"
    compileSdk = Deps.Congif.compileSdk

    defaultConfig {
        minSdk = Deps.Congif.minSdk
        targetSdk = Deps.Congif.targetSdk

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
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
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = Deps.AndroidX.Compose.composeVersion
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    api(Deps.AndroidX.core)
    api(Deps.AndroidX.Compose.Ui.main)
    api(Deps.AndroidX.Compose.Ui.toolingPreview)
    api(Deps.AndroidX.Compose.material)
    api(Deps.AndroidX.Compose.animation)
    api(Deps.AndroidX.Compose.fondation)
    api(Deps.AndroidX.Compose.runtime)
    api(Deps.AndroidX.Compose.navigation)

    debugApi(Deps.AndroidX.Compose.Ui.tooling)
    debugApi(Deps.AndroidX.Compose.Ui.manifest)
    testApi(Deps.Test.junit)
    androidTestApi(Deps.AndroidX.junit)
    androidTestApi(Deps.AndroidX.espresso)
    androidTestApi(Deps.AndroidX.Compose.Ui.test)
}