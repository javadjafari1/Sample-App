object Deps {
    object Congif {
        val nameSpace by lazy { "ir.javadjafarii.sampleapp" }
        val compileSdk by lazy { 32 }
        val minSdk by lazy { 21 }
        val targetSdk by lazy { 32 }
        val versionCode by lazy { 1 }
        val versionName by lazy { "1.0.0" }
    }

    object AndroidX {
        object Compose {
            val composeVersion by lazy { "1.2.0" }
        }

        val core by lazy { "androidx.core:core-ktx:1.8.0" }
        val lifecycle by lazy { "androidx.lifecycle:lifecycle-runtime-ktx:2.5.1" }
        val activity by lazy { "androidx.activity:activity-compose:1.5.1" }
    }
}