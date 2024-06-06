plugins {
    `android-library`
    `kotlin-android`
}

// Apply a base Gradle file, so we don't need to duplicate all the shared dependencies and versions across each module.
apply(from = "$rootDir/base-module.gradle")

android {
    namespace = "com.example.tracker.data"
}

dependencies {
    implementation(project(Modules.CORE))
    implementation(project(Modules.TRACKER_DOMAIN))

    implementation(Retrofit.OKHTTP)
    implementation(Retrofit.RETROFIT)
    implementation(Retrofit.OKHTTP_LOGGING_INTERCEPTOR)
    implementation(Retrofit.MOSHI_CONVERTER)

    "kapt"(Room.ROOM_COMPILER)
    implementation(Room.ROOM_KTX)
    implementation(Room.ROOM_RUNTIME)
}


