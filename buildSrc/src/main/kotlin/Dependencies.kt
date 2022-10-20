object Application {

    const val name        = "com.criticalgnome.compose_skeleton"
    const val currentSdk  = 33
    const val minSdk      = 23
    const val versionCode = 1
    const val versionName = "1.0"
}

const val daggerVersion          = "2.44"
private const val composeVersion = "1.2.1"
private const val roomVersion    = "2.4.3"

object Plugins {

    object Versions {
        const val android = "7.3.1"
        const val kotlin  = "1.6.10"
        const val junit5  = "1.8.2.1"
    }

    const val androidApplication = "com.android.application"
    const val androidLibrary     = "com.android.library"
    const val kotlinAndroid      = "org.jetbrains.kotlin.android"
    const val junit5             = "de.mannodermaus.android-junit5"
    const val kapt               = "kotlin-kapt"
    const val hilt               = "com.google.dagger.hilt.android"
}

object Libraries {

    private object Versions {
        const val core      = "1.9.0"
        const val lifecycle = "2.5.1"
        const val activity  = "1.6.0"
        const val retrofit  = "2.9.0"
        const val coil      = "2.2.2"
    }

    // Core
    const val androidCore             = "androidx.core:core-ktx:${Versions.core}"
    const val lifecycleRuntime        = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycle}"
    const val activityCompose         = "androidx.activity:activity-compose:${Versions.activity}"
    // Compose
    const val composeUi               = "androidx.compose.ui:ui:$composeVersion"
    const val composeUiToolingPreview = "androidx.compose.ui:ui-tooling-preview:$composeVersion"
    const val composeMaterial         = "androidx.compose.material:material:$composeVersion"
    // Dagger
    const val dagger                  = "com.google.dagger:dagger:$daggerVersion"
    const val daggerCompiler          = "com.google.dagger:dagger-compiler:$daggerVersion"
    // Hilt
    const val hilt                    = "com.google.dagger:hilt-android:$daggerVersion"
    const val hiltCompiler            = "com.google.dagger:hilt-android-compiler:$daggerVersion"
    // Room
    const val room                    = "androidx.room:room-runtime:$roomVersion"
    const val roomKtx                 = "androidx.room:room-ktx:$roomVersion"
    const val roomCompiler            = "androidx.room:room-compiler:$roomVersion"
    // Retrofit
    const val retrofit                = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val retrofitMoshi           = "com.squareup.retrofit2:converter-moshi:${Versions.retrofit}"
    // Coil
    const val coil                    = "io.coil-kt:coil:${Versions.coil}"
    const val coilCompose             = "io.coil-kt:coil-compose:${Versions.coil}"
}

object TestLibraries {

    private object Versions {
        const val junit5            = "5.8.2"
        const val testRunner        = "1.4.0"
        const val junit5AndroidTest = "1.3.0"
        const val mockk             = "1.13.2"
    }

    // Junit5
    const val junit5Api               = "org.junit.jupiter:junit-jupiter-api:${Versions.junit5}"
    const val junit5Params            = "org.junit.jupiter:junit-jupiter-params:${Versions.junit5}"
    const val junit5Engine            = "org.junit.jupiter:junit-jupiter-engine:${Versions.junit5}"
    const val androidTestRunner       = "androidx.test:runner:${Versions.testRunner}"
    const val junit5AndroidTestCore   = "de.mannodermaus.junit5:android-test-core:${Versions.junit5AndroidTest}"
    const val junit5AndroidTestRunner = "de.mannodermaus.junit5:android-test-runner:${Versions.junit5AndroidTest}"
    // MockK
    const val mockk                   = "io.mockk:mockk:${Versions.mockk}"
    const val mockkAndroid            = "io.mockk:mockk-android:${Versions.mockk}"
    // Room
    const val roomTesting             = "androidx.room:room-testing:$roomVersion"
}

object DebugLibraries {

    // Compose
    const val composeUiTooling      = "androidx.compose.ui:ui-tooling:$composeVersion"
    const val composeUiTestManifest = "androidx.compose.ui:ui-test-manifest:$composeVersion"
}
