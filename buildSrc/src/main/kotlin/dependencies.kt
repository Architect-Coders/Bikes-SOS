const val kotlinVersion = "1.3.50"

object BuildPlugins {

    object Versions {
        const val buildToolsVersion = "3.5.3"
    }

    const val androidGradlePlugin = "com.android.tools.build:gradle:${Versions.buildToolsVersion}"
    const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion"
    const val androidApplication = "com.android.application"
    const val kotlinAndroid = "kotlin-android"
    const val kotlinAndroidExtensions = "kotlin-android-extensions"

}

object AndroidSdk {
    const val minSdk = 23
    const val compileSdk = 29
    const val target = compileSdk
    const val buildToolsVersion = "29.0.2"
}

object Libraries {
    private object Versions {
        const val jetpack = "1.1.0"
        const val constraintLayout = "1.1.3"
        const val ktx = "1.1.0"
    }

    const val kotlinStdLib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:$kotlinVersion"
    const val appCompat = "androidx.appcompat:appcompat:${Versions.jetpack}"
    const val constraintLayout =
        "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
    const val ktxCore = "androidx.core:core-ktx:${Versions.ktx}"
}

object TestLibraries {
    private object Versions {
        const val junit4 = "4.12"
        const val testRunner = "1.1.1"
        const val espresso = "3.2.0"
    }

    const val junit4 = "junit:junit:${Versions.junit4}"
    const val extJunit = "androidx.test.ext:junit:${Versions.testRunner}"
    const val espresso = "androidx.test.espresso:espresso-core:${Versions.espresso}"
}