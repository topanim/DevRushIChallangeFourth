pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
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

rootProject.name = "DevRushIChallangeFourth"
include(":app")
include(":core_data")
include(":core_data:api")
include(":core_data:impl")
include(":storage")
include(":storage:api")
include(":storage:impl")
include(":feature")
include(":feature:quotes")
include(":feature:quotes:api")
include(":feature:quotes:impl")
include(":core_navigation")
