plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("dagger.hilt.android.plugin")
    id("kotlin-kapt")
}

android {
    namespace = ProjectConfig.APP_ID
    compileSdk = ProjectConfig.COMPILE_SDK

    defaultConfig {
        applicationId = ProjectConfig.APP_ID
        minSdk = ProjectConfig.MIN_SDK
        targetSdk = ProjectConfig.TARGET_SDK
        versionCode = ProjectConfig.VERSION_CODE
        versionName = ProjectConfig.VERSION_NAME

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_18
        targetCompatibility = JavaVersion.VERSION_18
    }
    kotlinOptions {
        jvmTarget = "18"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = Compose.COMPOSE_COMPILER_VERSION
    }
}

dependencies {
    implementation(Compose.COMPILER)
    implementation(Compose.UI)
    implementation(Compose.UI_TOOLING_PREVIEW)
    implementation(Compose.HILT_NAVIGATION_COMPOSE)
    implementation(Compose.MATERIAL)
    implementation(Compose.RUNTIME)
    implementation(Compose.NAVIGATION)
    implementation(Compose.VIEWMODEL_COMPOSE)
    implementation(Compose.ACTIVITY_COMPOSE)

    implementation(DaggerHilt.HILT_ANDROID)
    kapt(DaggerHilt.HILT_COMPILER)

    implementation(project(Modules.CORE))
    implementation(project(Modules.ONBOARDING_PRESENTATION))
    implementation(project(Modules.ONBOARDING_DOMAIN))
    implementation(project(Modules.TRACKER_PRESENTATION))
    implementation(project(Modules.TRACKER_DOMAIN))
    implementation(project(Modules.TRACKER_DATA))

    implementation(AndroidX.CORE_KTX)
    implementation(AndroidX.APP_COMPAT)

    implementation(Coil.COIL_COMPOSE)

    implementation(Google.MATERIAL)

    implementation(Retrofit.OKHTTP)
    implementation(Retrofit.RETROFIT)
    implementation(Retrofit.OKHTTP_LOGGING_INTERCEPTOR)
    implementation(Retrofit.MOSHI_CONVERTER)

    kapt(Room.ROOM_COMPILER)
    implementation(Room.ROOM_KTX)
    implementation(Room.ROOM_RUNTIME)

    testImplementation(Testing.JUNIT4)
    testImplementation(Testing.JUNIT_ANDROID_EXT)
    testImplementation(Testing.TRUTH)
    testImplementation(Testing.COROUTINES)
    testImplementation(Testing.TURBINE)
    testImplementation(Testing.COMPOSE_UI_TEST)
    testImplementation(Testing.MOCKK)
    testImplementation(Testing.MOCK_WEB_SERVER)

    androidTestImplementation(Testing.JUNIT4)
    androidTestImplementation(Testing.JUNIT_ANDROID_EXT)
    androidTestImplementation(Testing.TRUTH)
    androidTestImplementation(Testing.COROUTINES)
    androidTestImplementation(Testing.TURBINE)
    androidTestImplementation(Testing.COMPOSE_UI_TEST)
    androidTestImplementation(Testing.MOCKK_ANDROID)
    androidTestImplementation(Testing.MOCK_WEB_SERVER)
    androidTestImplementation(Testing.HILT_TESTING)
    kaptAndroidTest(DaggerHilt.HILT_COMPILER)
    androidTestImplementation(Testing.TEST_RUNNER)
}