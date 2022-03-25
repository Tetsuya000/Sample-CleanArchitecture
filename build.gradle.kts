plugins {
    id("com.android.application") version "7.1.2" apply false
    id("com.android.library") version "7.1.2" apply false
    id("org.jetbrains.kotlin.android") version "1.6.10" apply false
}

buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        // Navigation
        classpath("androidx.navigation:navigation-safe-args-gradle-plugin:2.5.0-alpha03")

        // Hilt
        classpath("com.google.dagger:hilt-android-gradle-plugin:2.41")
    }
}

tasks.register("clean") {
    doFirst {
        delete(rootProject.buildDir)
    }
}

allprojects {
    val ktlint by configurations.creating

    dependencies {
        ktlint("com.pinterest:ktlint:0.45.1") {
            attributes {
                attribute(Bundling.BUNDLING_ATTRIBUTE, objects.named(Bundling.EXTERNAL))
            }
        }
    }

    val ktlintFormat by tasks.creating(JavaExec::class) {
        description = "Fix Kotlin code style deviations."
        classpath = ktlint
        mainClass.set("com.pinterest.ktlint.Main")
        args = listOf("-F", "src/**/*.kt")
    }
}