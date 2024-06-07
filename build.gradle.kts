// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath(Build.ANDROID_BUILD_TOOLS)
        classpath(Build.KOTLIN_GRADLE_PLUGIN)
        classpath(Build.HILT_ANDROID_GRADLE_PLUGIN)
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.9.0")

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}

tasks.register("clean", Delete::class){
    delete(rootProject.layout.buildDirectory)
}
