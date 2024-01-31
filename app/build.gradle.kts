plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("androidx.navigation.safeargs.kotlin")
    id("kotlin-parcelize")
    id("com.google.dagger.hilt.android")
    kotlin("kapt")
}

android {
    namespace = "uz.bahrom.effective_mobile"
    compileSdk = 34

    defaultConfig {
        applicationId = "uz.bahrom.effective_mobile"
        minSdk = 24
        targetSdk = 34
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    /**
     *  CORE
     */
    implementation("androidx.core:core-ktx:1.12.0")

    /**
     *  AndroidX vs Material
     */
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")

    /**
     *  Lifecycle
     */
    implementation("androidx.legacy:legacy-support-v4:1.0.0")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.7.0")
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.7.0")
    implementation("androidx.lifecycle:lifecycle-extensions:2.2.0")
    implementation("androidx.fragment:fragment-ktx:1.6.2")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.7.0")
    //noinspection LifecycleAnnotationProcessorWithJava8
    kapt("androidx.lifecycle:lifecycle-compiler:2.7.0")

    /**
     *  Testing
     */
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    /**
     * HILT
     */
    implementation("com.google.dagger:hilt-android:2.48")
    kapt("com.google.dagger:hilt-android-compiler:2.48")

    /**
     * Navigation
     * */
    implementation("androidx.navigation:navigation-fragment-ktx:2.7.6")
    implementation("androidx.navigation:navigation-ui-ktx:2.7.6")

    /**
     *   viewBinding
     */
    implementation("com.github.kirich1409:viewbindingpropertydelegate-noreflection:1.5.9")

    /**
     * Timber
     **/
    implementation("com.jakewharton.timber:timber:5.0.1")

    /**
     * REST API: Retrofit 2
     */
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.jakewharton.retrofit:retrofit2-kotlin-coroutines-adapter:0.9.2")
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")
    implementation("com.squareup.okhttp3:logging-interceptor:5.0.0-alpha.2")

    /**
     *  Chuck
     */
    debugImplementation("com.github.chuckerteam.chucker:library:4.0.0")
    releaseImplementation("com.github.chuckerteam.chucker:library-no-op:3.5.2")

    /**
     * Gson
     */
    implementation("com.google.code.gson:gson:2.10.1")

    /**
     * Coroutines
     */
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.3")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.3")

    /**
     * ViewModel
     */
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.7.0")
    implementation("androidx.fragment:fragment-ktx:1.6.2")

    /**
     * ROOM
     */
    implementation("androidx.room:room-runtime:2.6.1")
    annotationProcessor("androidx.room:room-compiler:2.6.1")
    //noinspection KaptUsageInsteadOfKsp
    kapt("androidx.room:room-compiler:2.6.1")
}