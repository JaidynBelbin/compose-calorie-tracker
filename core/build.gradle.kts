plugins {
    `android-library`
    `kotlin-android`
}

// Apply the entire base-module gradle file, so we don't need to duplicate all the shared dependencies and versions across each module.
apply(from = "$rootDir/base-module.gradle")

android {
    namespace = "com.example.core"
}


