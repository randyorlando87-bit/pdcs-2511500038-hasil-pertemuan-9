plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.a2511500038.mahasiswa"
    compileSdk {
        version = release(37) {
            minorApiLevel = 1
        }
        buildFeatures {
            viewBinding = true

        }

        defaultConfig {
            applicationId = "com.a2511500038.mahasiswa"
            minSdk = 24
            targetSdk = 37
            versionCode = 1
            versionName = "1.0"

            testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        }

        buildTypes {
            release {
                isMinifyEnabled = false
                proguardFiles(
                    getDefaultProguardFile("proguard-android-optimize.txt"),
                    "proguard-rules.pro"
                )
            }
        }
        compileOptions {
            sourceCompatibility = JavaVersion.VERSION_11
            targetCompatibility = JavaVersion.VERSION_11
        }
    }

    //noinspection WrongGradleMethod
    dependencies {
        implementation(libs.androidx.core.ktx)
        implementation(libs.androidx.appcompat)
        implementation(libs.material)
        implementation(libs.androidx.activity)
        implementation(libs.androidx.constraintlayout)
        testImplementation(libs.junit)
        androidTestImplementation(libs.androidx.junit)
        androidTestImplementation(libs.androidx.espresso.core)

        implementation("com.squareup.retrofit2:retrofit:2.11.0")
        implementation("com.squareup.retrofit2:converter-gson:2.11.0")

        implementation("com.google.code.gson:gson:2.11.0")

        implementation("com.squareup.okhttp3:logging-interceptor:4.12.0")

        implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.8.1")

        implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.8.7")
    }
}