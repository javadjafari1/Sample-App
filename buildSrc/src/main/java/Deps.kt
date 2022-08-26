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
            object Ui {
                private val version by lazy { "1.2.1" }
                val main by lazy { "androidx.compose.ui:ui:$version" }
                val toolingPreview by lazy { "androidx.compose.ui:ui-tooling-preview:$version" }
                val tooling by lazy { "androidx.compose.ui:ui-tooling:$version" }
                val test by lazy { "androidx.compose.ui:ui-test-junit4:$version" }
                val manifest by lazy { "androidx.compose.ui:ui-test-manifest:$version" }
            }

            val composeVersion by lazy { "1.3.0" }
            val material by lazy { "androidx.compose.material:material:1.2.1" }
            val animation by lazy { "androidx.compose.animation:animation:1.2.1" }
            val fondation by lazy { "androidx.compose.foundation:foundation:1.2.1" }
            val runtime by lazy { "androidx.compose.runtime:runtime:1.2.1" }
            val navigation by lazy { "androidx.navigation:navigation-compose:2.5.1" }
        }

        val core by lazy { "androidx.core:core-ktx:1.8.0" }
        val lifecycle by lazy { "androidx.lifecycle:lifecycle-runtime-ktx:2.5.1" }
        val activity by lazy { "androidx.activity:activity-compose:1.5.1" }
        val junit by lazy { "androidx.test.ext:junit:1.1.3" }
        val espresso by lazy { "androidx.test.espresso:espresso-core:3.4.0" }
    }

    object Accompanist {
        private val version by lazy { "0.25.0" }
        val systemUiController by lazy {
            "com.google.accompanist:accompanist-systemuicontroller:$version"
        }
    }

    object Test {
        val junit by lazy { "junit:junit:4.13.2" }
    }

    object Modules {
        val commonUi by lazy { ":commonui" }
        val data by lazy { ":data" }
        val domain by lazy { ":domain" }
        val model by lazy { ":model" }
        val ui by lazy { ":ui" }
    }
}