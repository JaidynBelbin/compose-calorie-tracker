object Build {
    private const val ANDROID_BUILD_TOOLS_VERSION = "8.4.1"
    const val ANDROID_BUILD_TOOLS = "com.android.tools.build:gradle:$ANDROID_BUILD_TOOLS_VERSION"

    const val KOTLIN_GRADLE_PLUGIN = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Kotlin.VERSION}"

    private const val HILT_ANDROID_GRADLE_PLUGIN_VERSION = "2.38.1"
    const val HILT_ANDROID_GRADLE_PLUGIN = "com.google.dagger:hilt-android-gradle-plugin:$HILT_ANDROID_GRADLE_PLUGIN_VERSION"
}