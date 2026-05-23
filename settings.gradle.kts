// settings.gradle.kts
pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
    // Removed the manual 'versionCatalogs' block because Gradle 9.5+ 
    // automatically loads gradle/libs.versions.toml by default.
}

rootProject.name = "ExpressiveTodo"
include(":app")
