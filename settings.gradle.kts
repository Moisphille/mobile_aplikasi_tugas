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
}

rootProject.name = "mobile aplikasi tugas"
include(":app")

plugins {
    id("com.gradle.enterprise") version("3.16.2")
}

gradleEnterprise {
    // configuration
}
 