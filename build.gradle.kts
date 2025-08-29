import cn.lalaki.pub.BaseCentralPortalPlusExtension.PublishingType
import org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi
import org.jetbrains.kotlin.gradle.dsl.JvmTarget

val user: String by project
val repo: String by project
val g: String by project
val artifact: String by project
val v: String by project
val desc: String by project

val localMavenRepo = uri(layout.buildDirectory.dir("repo").get())

plugins {
    alias(libs.plugins.compose.kotlin)
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlinter)
    alias(libs.plugins.compose)
    alias(libs.plugins.central)
    alias(libs.plugins.dokka)
    `maven-publish`
    signing
}

group = g
version = v

repositories {
    mavenCentral()
    maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    google()
}

kotlin {
    jvm()

    androidTarget {
        publishLibraryVariants("release")
        @OptIn(ExperimentalKotlinGradlePluginApi::class)
        compilerOptions {
            jvmTarget.set(JvmTarget.JVM_17)
        }
    }

    iosX64()
    iosArm64()
    iosSimulatorArm64()

    @Suppress("unused")
    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(compose.ui)
                implementation(compose.foundation)
                implementation(compose.material)
                implementation(compose.animation)
            }
        }
        val commonTest by getting {
            dependencies {
                // Add common test dependencies if needed
            }
        }
        val jvmMain by getting {
            dependencies {
                implementation(compose.desktop.common)
                implementation(libs.precompose)
                implementation(libs.malefic.theming)
            }
        }
        val androidMain by getting {
            dependencies {
                // Android-specific dependencies if needed
            }
        }
    }
}

android {
    namespace = "$g.$artifact"
    compileSdk = libs.versions.android.compileSdk.get().toInt()
    defaultConfig {
        minSdk = libs.versions.android.minSdk.get().toInt()
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

publishing {
    publications {
        repositories {
            maven {
                url = localMavenRepo
            }
        }
    }
}

signing {
    useGpgCmd()
    sign(publishing.publications)
}

centralPortalPlus {
    url = localMavenRepo
    tokenXml = uri(layout.projectDirectory.file("user_token.xml"))
    publishingType = PublishingType.AUTOMATIC
}

tasks.apply {
    build {
        dependsOn(named("formatAndLintKotlin"))
        dependsOn(dokkaGenerate)
    }
    publish {
        dependsOn(named("formatAndLintKotlin"))
    }
    register("formatAndLintKotlin") {
        group = "formatting"
        description = "Fix Kotlin code style deviations with kotlinter"
        dependsOn(named("formatKotlin"))
        dependsOn(named("lintKotlin"))
    }
    check {
        dependsOn("installKotlinterPrePushHook")
    }
}

dokka {
    dokkaPublications.html {
        outputDirectory.set(layout.buildDirectory.dir("dokka"))
    }
}
