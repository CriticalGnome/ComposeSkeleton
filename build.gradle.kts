plugins {
    id(Plugins.androidApplication) version Plugins.Versions.android apply false
    id(Plugins.androidLibrary) version Plugins.Versions.android apply false
    id(Plugins.kotlinAndroid) version Plugins.Versions.kotlin apply false
    id(Plugins.hilt) version daggerVersion apply false
}
