object Testing {
    private const val JUNIT_VERSION = "4.13.2"
    const val JUNIT4 = "junit:junit:$JUNIT_VERSION"

    private const val JUNIT_ANDROID_EXT_VERSION = "1.1.3"
    const val JUNIT_ANDROID_EXT = "androidx.test.ext:junit:$JUNIT_ANDROID_EXT_VERSION"

    private const val COROUTINES_TEST_VERSION = "1.5.1"
    const val COROUTINES = "org.jetbrains.kotlinx:kotlinx-coroutines-test:$COROUTINES_TEST_VERSION"

    private const val TRUTH_VERSION = "1.1.3"
    const val TRUTH = "com.google.truth:truth:$TRUTH_VERSION"

    private const val MOCKK_VERSION = "1.13.11"
    const val MOCKK = "io.mockk:mockk:$MOCKK_VERSION"
    const val MOCKK_ANDROID = "io.mockk:mockk-android:$MOCKK_VERSION"

    private const val TURBINE_VERSION = "0.7.0"
    const val TURBINE = "app.cash.turbine:turbine:$TURBINE_VERSION"

    private const val MOCK_WEB_SERVER_VERSION = "4.9.3"
    const val MOCK_WEB_SERVER = "com.squareup.okhttp3:mockwebserver:$MOCK_WEB_SERVER_VERSION"

    const val COMPOSE_UI_TEST = "androidx.compose.ui:ui-test-junit4:${Compose.COMPOSE_VERSION}"

    const val HILT_TESTING = "com.google.dagger:hilt-android-testing:${DaggerHilt.VERSION}"

    private const val TEST_RUNNER_VERSION = "1.4.0"
    const val TEST_RUNNER = "androidx.test:runner:$TEST_RUNNER_VERSION"
}
