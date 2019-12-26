const val kotlinVersion = "1.3.50"

object BuildPlugins {

    object Versions {
        const val buildToolsVersion = "3.5.3"
    }

    const val androidGradlePlugin = "com.android.tools.build:gradle:${Versions.buildToolsVersion}"
    const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion"
    const val androidApplication = "com.android.application"
    const val kotlinAndroid = "android"
    const val kotlinAndroidExtensions = "android.extensions"
    const val kotlinKapt = "kapt"

}

object AndroidSdk {
    const val minSdk = 23
    const val compileSdk = 29
    const val target = compileSdk
    const val buildToolsVersion = "29.0.2"
}

object Libraries {
    private object Versions {
        const val appCompat = "1.1.0"
        const val constraintLayout = "1.1.3"
        const val ktx = "1.1.0"
        const val androidX = "2.1.0"
        const val legacySupport = "1.0.0"
        const val materialDesign = "1.0.0"
    }

    const val kotlinStdLib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:$kotlinVersion"
    const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
    const val constraintLayout =
        "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
    const val ktxCore = "androidx.core:core-ktx:${Versions.ktx}"

    const val legacySupport = "androidx.legacy:legacy-support-v4:${Versions.legacySupport}"
    const val materialDesign = "com.google.android.material:material:${Versions.materialDesign}"

    const val navigationFragment = "androidx.navigation:navigation-fragment:${Versions.androidX}"
    const val navigationUi = "androidx.navigation:navigation-ui:${Versions.androidX}"
    const val navigationFragmentKtx = "androidx.navigation:navigation-fragment-ktx:${Versions.androidX}"
    const val navigationUiKtx = "androidx.navigation:navigation-ui-ktx:${Versions.androidX}"

    const val lifecycleExtensions = "androidx.lifecycle:lifecycle-extensions:${Versions.androidX}"
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