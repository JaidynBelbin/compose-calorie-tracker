object Compose {
    const val COMPOSE_VERSION = "1.6.7"
    const val COMPOSE_COMPILER_VERSION = "1.4.6"
    const val MATERIAL = "androidx.compose.material:material:$COMPOSE_VERSION"
    const val UI = "androidx.compose.ui:ui:$COMPOSE_VERSION"
    const val UI_TOOLING_PREVIEW = "androidx.compose.ui:ui-tooling-preview:$COMPOSE_VERSION"
    const val RUNTIME = "androidx.compose.runtime:runtime:$COMPOSE_VERSION"
    const val COMPILER = "androidx.compose.compiler:compiler:$COMPOSE_COMPILER_VERSION"

    private const val NAVIGATION_VERSION = "2.7.7"
    const val NAVIGATION = "androidx.navigation:navigation-compose:$NAVIGATION_VERSION"

    private const val HILT_NAVIGATION_COMPOSE_VERSION = "1.2.0"
    const val HILT_NAVIGATION_COMPOSE =
        "androidx.hilt:hilt-navigation-compose:$HILT_NAVIGATION_COMPOSE_VERSION"

    private const val ACTIVITY_COMPOSE_VERSION = "1.9.0"
    const val ACTIVITY_COMPOSE = "androidx.activity:activity-compose:$ACTIVITY_COMPOSE_VERSION"

    private const val LIFECYCLE_VERSION = "2.8.1"
    const val VIEWMODEL_COMPOSE =
        "androidx.lifecycle:lifecycle-viewmodel-compose:$LIFECYCLE_VERSION"
}
