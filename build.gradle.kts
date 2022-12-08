plugins {
    id(Plugins.androidApplication) version Versions.androidPlugin apply false
    id(Plugins.androidLibrary) version Versions.androidPlugin apply false
    id(Plugins.kotlinAndroid) version Versions.kotlin apply false
    id(Plugins.hilt) version Versions.dagger apply false
}
