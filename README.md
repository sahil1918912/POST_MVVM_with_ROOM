DEPENDENCIES

    //     retrofit
    implementation ("com.squareup.retrofit2:retrofit:2.9.0")
    //     gson converter
    implementation ("com.squareup.retrofit2:converter-gson:2.9.0")
    // okHttp interceptor
    implementation ("com.squareup.okhttp3:logging-interceptor:4.9.1")

    //Room
    val room_version = "2.6.1"
    implementation ("androidx.room:room-runtime:$room_version")
    annotationProcessor ("androidx.room:room-compiler:$room_version")
    kapt("androidx.room:room-compiler:$room_version")
    implementation ("androidx.room:room-ktx:$room_version")

    //    ViewModel
    implementation ("androidx.lifecycle:lifecycle-viewmodel:2.8.4")
