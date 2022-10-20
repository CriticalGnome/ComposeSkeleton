plugins {
    id(Plugins.androidApplication)
    id(Plugins.kotlinAndroid)
    id(Plugins.junit5) version Plugins.Versions.junit5
    id(Plugins.kapt)
    id(Plugins.hilt)
}

android {
    namespace = Application.name
    compileSdk = Application.currentSdk

    defaultConfig {
        applicationId = Application.name
        minSdk = Application.minSdk
        targetSdk = Application.currentSdk
        versionCode = Application.versionCode
        versionName = Application.versionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        testInstrumentationRunnerArguments["runnerBuilder"] = "de.mannodermaus.junit5.AndroidJUnit5Builder"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
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
        kotlinCompilerExtensionVersion = "1.1.1"
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
    kapt {
        correctErrorTypes = true
    }
}

dependencies {
    // Core
    implementation(Libraries.androidCore)
    implementation(Libraries.lifecycleRuntime)
    implementation(Libraries.activityCompose)
    // Compose
    implementation(Libraries.composeUi)
    implementation(Libraries.composeUiToolingPreview)
    implementation(Libraries.composeMaterial)
    // Dagger
    implementation(Libraries.dagger)
    kapt(Libraries.daggerCompiler)
    // Hilt
    implementation(Libraries.hilt)
    kapt(Libraries.hiltCompiler)
    // Room
    implementation(Libraries.room)
    implementation(Libraries.roomKtx)
    kapt(Libraries.roomCompiler)
    // Retrofit
    implementation(Libraries.retrofit)
    implementation(Libraries.retrofitMoshi)
    // Coil
    implementation(Libraries.coil)
    implementation(Libraries.coilCompose)
    // Testing
    testImplementation(TestLibraries.junit5Api)
    testImplementation(TestLibraries.junit5Params)
    testImplementation(TestLibraries.mockk)
    testImplementation(TestLibraries.roomTesting)
    testRuntimeOnly(TestLibraries.junit5Engine)
    androidTestImplementation(TestLibraries.androidTestRunner)
    androidTestImplementation(TestLibraries.junit5Api)
    androidTestImplementation(TestLibraries.junit5AndroidTestCore)
    androidTestRuntimeOnly(TestLibraries.junit5AndroidTestRunner)
    androidTestImplementation(TestLibraries.mockkAndroid)
    // Debug
    debugImplementation(DebugLibraries.composeUiTooling)
    debugImplementation(DebugLibraries.composeUiTestManifest)
}
