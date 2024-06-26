plugins {
    `android-library`
    `kotlin-android`
}

// Apply a base Gradle file, so we don't need to duplicate all the shared dependencies and versions across each module.
apply(from = "$rootDir/compose-module.gradle")

android {
    namespace = "com.example.core_ui"
}