@file:Suppress("PackageDirectoryMismatch")

object Dependencies {
    // Core Kotlin
    const val coreKtx = "androidx.core:core-ktx:${Versions.coreKtxVersion}"

    const val multidex = "androidx.multidex:multidex:${Versions.multidexVersion}"

    // Core UI, Layout
    const val activityKtx = "androidx.activity:activity-ktx:${Versions.activityKtxVersion}"
    //const val material = "com.google.android.material:material:${Versions.materialVersion}"
    const val material3 = "androidx.compose.material3:material3:${Versions.material3Version}"

    // Dagger Hilt
    const val daggerHilt = "com.google.dagger:hilt-android:${Versions.daggerHiltVersion}"
    const val daggerHiltCompiler =
        "com.google.dagger:hilt-android-compiler:${Versions.daggerHiltVersion}"

    // Retrofit, Gson, OKHttp
    const val gson = "com.google.code.gson:gson:${Versions.gsonVersion}"
    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofitVersion}"
    const val retrofitGson = "com.squareup.retrofit2:converter-gson:${Versions.retrofitVersion}"
    const val retrofitRxJava = "com.squareup.retrofit2:adapter-rxjava2:${Versions.retrofitVersion}"
    const val okHttp = "com.squareup.okhttp3:okhttp:${Versions.okHttpVersion}"
    const val okHttpLoggingInterceptor =
        "com.squareup.okhttp3:logging-interceptor:${Versions.okHttpVersion}"

    // Coroutines
    const val coroutinesCore =
        "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutinesVersion}"
    const val coroutinesAndroid =
        "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutinesVersion}"
    const val coroutinesTest =
        "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Versions.coroutinesVersion}"

    // Kotlin Lint
    const val ktlint = "com.pinterest:ktlint:${Versions.ktlintVersion}"

    // Compose
    const val composeUI = "androidx.compose.ui:ui:${Versions.composeVersion}"
    const val composeMaterial = "androidx.compose.material:material:${Versions.composeVersion}"
    const val composeAnimation = "androidx.compose.animation:animation:${Versions.composeVersion}"
    const val composeTooling = "androidx.compose.ui:ui-tooling:${Versions.composeVersion}"
    const val composeToolingPreview = "androidx.compose.ui:ui-tooling-preview:${Versions.composeVersion}"
    const val composeActivity =
        "androidx.activity:activity-compose:${Versions.composeActivityVersion}"
    const val composeViewModel =
        "androidx.lifecycle:lifecycle-viewmodel-compose:${Versions.composeViewModelVersion}"
    const val composeRuntime =
        "androidx.compose.runtime:runtime:${Versions.composeVersion}"
    const val composeLiveData =
        "androidx.compose.runtime:runtime-livedata:${Versions.composeVersion}"
    const val composeUiTest = "androidx.compose.ui:ui-test-junit4:${Versions.composeVersion}"
    const val composeConstraintLayout =
        "androidx.constraintlayout:constraintlayout-compose:${Versions.composeConstraintLayoutVersion}"
    const val composeNavigation =
        "androidx.navigation:navigation-compose:${Versions.composeNavigationVersion}"
    const val hiltNavigationCompose =
        "androidx.hilt:hilt-navigation-compose:${Versions.hiltNavigationCompose}"
    const val composeSwipeRefresh = "com.google.accompanist:accompanist-swiperefresh:${Versions.composeSwipeRefreshVersion}"
    const val composeCoil = "com.google.accompanist:accompanist-coil:${Versions.composeCoilVersion}"
    const val composePaging = "androidx.paging:paging-compose:${Versions.composePagingVersion}"

    // Room Database
    const val roomRuntime = "androidx.room:room-runtime:${Versions.roomVersion}"
    const val roomKtx = "androidx.room:room-ktx:${Versions.roomVersion}"
    const val roomCompiler = "androidx.room:room-compiler:${Versions.roomVersion}"

    // Lifecycle
    const val lifecycleRumtime = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycleVersion}"
    const val lifecycleCompiler = "androidx.lifecycle:lifecycle-compiler:${Versions.lifecycleVersion}"
    const val viewmodelKtx = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycleVersion}"
    const val viewmodelState = "androidx.lifecycle:lifecycle-viewmodel-savedstate:${Versions.lifecycleStateVersion}"

    // Timber log
    const val timber = "com.jakewharton.timber:timber:${Versions.timberVersion}"

    // Unit Testing
    const val junit4 = "junit:junit:${Versions.junit4Version}"
    const val junitExtensions = "androidx.test.ext:junit:${Versions.junitExtensionsVersion}"
    const val junitExtensionsKtx = "androidx.test.ext:junit-ktx:${Versions.junitExtensionsVersion}"
    const val espressoCore = "androidx.test.espresso:espresso-core:${Versions.espressoCoreVersion}"

}
