plugins {
    `android-library`
    `kotlin-android`
}

// Apply a base Gradle file, so we don't need to duplicate all the shared dependencies and versions across each module.
apply(from = "$rootDir/compose-module.gradle")

android {
    namespace = "com.example.tracker.presentation"
}

dependencies {
    implementation(project(Modules.CORE))
    implementation(project(Modules.CORE_UI))
    implementation(project(Modules.TRACKER_DOMAIN))

    implementation(Coil.COIL_COMPOSE)
}


