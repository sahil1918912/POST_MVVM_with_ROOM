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

Colors

    <?xml version="1.0" encoding="utf-8"?>
    <resources>

    <color name="light_grey">#D3CFCF</color>
    <color name="black">#FF000000</color>
    <color name="black_light">#201F1F</color>
    <color name="orange">#FFA500</color>
    <color name="blue">#007BFF</color>
    <color name="white">#FFFFFFFF</color>
    <color name="white_light">#E1DADA</color>
    <color name="light_blue">#ADD8E6</color>
    <color name="red">#FF0000</color>

    </resources>


body
    {
  "InstructorId": "1477",
  "LocationId": "1",
  "Year": "2024",
  "StudentPayType": "ALL",
  "StudentPaymentType": "",
  "StudentType": "",
  "SearchType": "",
  "SearchTitle": "",
  "SPageNo": "1",
  "EvaluationType": ""
    }

data class RequestModel (
    val InstructorId : String,
    val LocationId : String,
    val Year : String,
    val StudentPayType : String,
    val StudentPaymentType : String,
    val StudentType : String,
    val SearchType : String,
    val SearchTitle : String,
    val SPageNo : String,
    val EvaluationType : String,
)



![logo_image](https://github.com/user-attachments/assets/cff41f99-0e56-4cf3-8d16-6b823c3a7d69)

