import java.io.FileInputStream
import java.util.*

plugins {
    id("com.android.application")
    id("dagger.hilt.android.plugin")
    kotlin("android")
    kotlin("kapt")
}

android {

    val keystorePropertiesFile = rootProject.file("keystore.properties")
    if (!keystorePropertiesFile.exists()) {
        logger.warn("Release builds may not work: signing config not found.")
        return@android
    }
    val keystoreProperties = Properties()
    keystoreProperties.load(FileInputStream(keystorePropertiesFile))

    compileSdk = Configs.compileSdkVersion
    defaultConfig {
        applicationId = Configs.applicationId
        minSdk = Configs.minSdkVersion
        targetSdk = Configs.targetSdkVersion
        versionCode = Configs.versionCode
        versionName = Configs.versionName

        renderscriptSupportModeEnabled = true
        multiDexEnabled = true

        testInstrumentationRunner = Configs.testInstrumentationRunner

        buildConfigField("String", "BASE_API_URL", "\"https://62f71132ab9f1f8e89f7f8f2.mockapi.io/api/\"")
    }

    signingConfigs {
        getByName("debug") {
            keyAlias = keystoreProperties["KEY_ALIAS"] as String
            keyPassword = keystoreProperties["KEY_PASSWORD"] as String
            storeFile = rootProject.file(keystoreProperties["STORE_FILE"] as String)
            storePassword = keystoreProperties["STORE_PASSWORD"] as String
        }
        create("release") {
            keyAlias = keystoreProperties["KEY_ALIAS"] as String
            keyPassword = keystoreProperties["KEY_PASSWORD"] as String
            storeFile =  rootProject.file(keystoreProperties["STORE_FILE"] as String)
            storePassword = keystoreProperties["STORE_PASSWORD"] as String
        }
    }

    buildTypes {
        getByName("debug") {
            isMinifyEnabled = false
            proguardFiles(
                    getDefaultProguardFile("proguard-android-optimize.txt"),
                    "proguard-rules.pro"
            )
            signingConfig = signingConfigs.getByName("debug")
        }
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                    getDefaultProguardFile("proguard-android-optimize.txt"),
                    "proguard-rules.pro"
            )
            signingConfig = signingConfigs.getByName("release")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_1_8.toString()
    }

    composeOptions {
        kotlinCompilerExtensionVersion = Versions.kotlinCompilerExtensionVersion
    }

    configurations.all {
        resolutionStrategy {
            exclude("org.jetbrains.kotlinx", "kotlinx-coroutines-debug")
        }
    }

    buildFeatures {
        viewBinding = true
        compose = true
    }

    testOptions {
        unitTests.isIncludeAndroidResources = true
    }

    packagingOptions {
        resources {
            excludes += "/META-INF/INDEX.LIST"
            excludes += "/META-INF/DEPENDENCIES"
            excludes += "/META-INF/LICENSE"
            excludes += "/META-INF/LICENSE.txt"
            excludes += "/META-INF/license.txt"
            excludes += "/META-INF/NOTICE"
            excludes += "/META-INF/NOTICE.txt"
            excludes += "/META-INF/notice.txt"
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }

}

kapt {
    correctErrorTypes = true
}

dependencies {

    // Core
    implementation(Dependencies.coreKtx)
    implementation(Dependencies.material3)
    implementation(Dependencies.activityKtx)

    // Multidex
    implementation(Dependencies.multidex)

    // Dagger Hilt
    implementation(Dependencies.daggerHilt)
    kapt(Dependencies.daggerHiltCompiler)
    implementation(Dependencies.hiltNavigationCompose)

    // Coroutines
    implementation(Dependencies.coroutinesCore)
    implementation(Dependencies.coroutinesAndroid)

    // Gson, Retrofit, OKHTTP
    implementation(Dependencies.gson)
    implementation(Dependencies.okHttp)
    implementation(Dependencies.retrofit)
    implementation(Dependencies.okHttpLoggingInterceptor)
    implementation(Dependencies.retrofitGson)
    implementation(Dependencies.retrofitRxJava)

    // Compose
    implementation(Dependencies.composeUI)
    implementation(Dependencies.composeTooling)
    implementation(Dependencies.composeToolingPreview)
    implementation(Dependencies.composeConstraintLayout)
    implementation(Dependencies.composeMaterial)
    implementation(Dependencies.composeRuntime)
    implementation(Dependencies.composeLiveData)
    implementation(Dependencies.composeActivity)
    implementation(Dependencies.composeViewModel)
    implementation(Dependencies.composeAnimation)
    implementation(Dependencies.composeNavigation)
    implementation(Dependencies.composeSwipeRefresh)
    implementation(Dependencies.composeCoil)
    implementation(Dependencies.composePaging)

    // Room
    implementation(Dependencies.roomRuntime)
    implementation(Dependencies.roomKtx)
    kapt(Dependencies.roomCompiler)

    // Lifecycle
    implementation(Dependencies.lifecycleRumtime)
    kapt(Dependencies.lifecycleCompiler)
    kapt(Dependencies.viewmodelState)

    // Timber Log
    implementation(Dependencies.timber)

    // Testing
    testImplementation(Dependencies.junit4)
    testImplementation(Dependencies.junitExtensionsKtx)
    testImplementation(Dependencies.coroutinesTest)
    androidTestImplementation(Dependencies.junitExtensions)
    androidTestImplementation(Dependencies.espressoCore)
}
