object Libraries {
    // Core
    const val androidCore             = "androidx.core:core-ktx:${Versions.core}"
    const val lifecycleRuntime        = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycle}"
    const val activityCompose         = "androidx.activity:activity-compose:${Versions.activity}"
    // Compose
    const val composeUi               = "androidx.compose.ui:ui:${Versions.compose}"
    const val composeUiToolingPreview = "androidx.compose.ui:ui-tooling-preview:${Versions.compose}"
    const val composeMaterial         = "androidx.compose.material:material:${Versions.compose}"
    // Dagger
    const val dagger                  = "com.google.dagger:dagger:${Versions.dagger}"
    const val daggerCompiler          = "com.google.dagger:dagger-compiler:${Versions.dagger}"
    // Hilt
    const val hilt                    = "com.google.dagger:hilt-android:${Versions.dagger}"
    const val hiltCompiler            = "com.google.dagger:hilt-android-compiler:${Versions.dagger}"
    // Room
    const val room                    = "androidx.room:room-runtime:${Versions.room}"
    const val roomKtx                 = "androidx.room:room-ktx:${Versions.room}"
    const val roomCompiler            = "androidx.room:room-compiler:${Versions.room}"
    // Retrofit
    const val retrofit                = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val retrofitMoshi           = "com.squareup.retrofit2:converter-moshi:${Versions.retrofit}"
    // Coil
    const val coil                    = "io.coil-kt:coil:${Versions.coil}"
    const val coilCompose             = "io.coil-kt:coil-compose:${Versions.coil}"
}
