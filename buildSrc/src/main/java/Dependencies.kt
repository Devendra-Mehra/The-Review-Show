object GradleClasspath {
    const val buildGradle = "com.android.tools.build:gradle:${Versions.build_gradle_version}"
    const val kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin_version}"
}

object AndroidX {
    // ViewModel and LiveData
    const val lifeCycleExtensions =
        "androidx.lifecycle:lifecycle-extensions:${Versions.lifecycle_version}"
    const val lifeCycleCompiler =
        "androidx.lifecycle:lifecycle-compiler:${Versions.lifecycle_version}"
    const val lifeCycleCompilerJava8 =
        "androidx.lifecycle:lifecycle-common-java8:${Versions.lifecycle_version}"
    // optional - ReactiveStreams support for LiveData
    const val lifeCycleReactiveStreams =
        "androidx.lifecycle:lifecycle-reactivestreams-ktx:${Versions.lifecycle_version}"
    const val room = "androidx.room:room-runtime:${Versions.room_version}"
    const val roomCompiler = "androidx.room:room-compiler:${Versions.room_version}"
    const val roomRxJava2 = "androidx.room:room-rxjava2:${Versions.room_version}"

    //App Compat
    const val appCompat = "androidx.appcompat:appcompat:${Versions.app_compat_version}"
    //Annotation
    const val annotations = "androidx.annotation:annotation:${Versions.support_lib_version}"
    const val androidKtx = "androidx.core:core-ktx:${Versions.ktx_version}"
    const val constraintLayout =
        "androidx.constraintlayout:constraintlayout:${Versions.constraint_layout_version}"
}

object Google {
    //Material design
    const val material = "com.google.android.material:material:${Versions.material_version}"
    //Dagger
    const val daggerAndroidProcessor =
        "com.google.dagger:dagger-android-processor:${Versions.dagger_version}"
    const val daggerCompiler = "com.google.dagger:dagger-compiler:${Versions.dagger_version}"
    const val daggerAndroid = "com.google.dagger:dagger-android:${Versions.dagger_version}"
    const val daggerAndroidSupport =
        "com.google.dagger:dagger-android-support:${Versions.dagger_version}"
}

object Gson {
    const val lib = "com.google.code.gson:gson:${Versions.gson_version}"
}

object Square {
    const val okHttp = "com.squareup.okhttp3:okhttp:${Versions.okHttp_version}"
    const val okHttpLoggingInterceptor =
        "com.squareup.okhttp3:logging-interceptor:${Versions.okHttp_version}"
    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit_version}"
    const val retrofitGson = "com.squareup.retrofit2:converter-gson:${Versions.retrofit_version}"
    const val retrofitRx = "com.squareup.retrofit2:adapter-rxjava2:${Versions.retrofit_version}"
    const val picasso = "com.squareup.picasso:picasso:${Versions.picasso_version}"
}

object ReactiveX {
    const val rxJava = "io.reactivex.rxjava2:rxjava:${Versions.rx_java_version}"
    const val rxAndroid = "io.reactivex.rxjava2:rxandroid:${Versions.rx_android_version}"
}

object JetBrains {
    const val kotlinStdLib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin_version}"
}
