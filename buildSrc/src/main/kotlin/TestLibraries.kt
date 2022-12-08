object TestLibraries {
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
    const val roomTesting             = "androidx.room:room-testing:${Versions.room}"
}
