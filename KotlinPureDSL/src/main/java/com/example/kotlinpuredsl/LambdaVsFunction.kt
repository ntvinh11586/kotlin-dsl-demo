package com.example.kotlinpuredsl

//class Response(
//    var code: Int? = 0
//)
//
//val getMessage = { response: Response ->
//    if(response.code !in 200..299) {
//        return "Error" // Error! Not allowed
//    }
//    response.message
//}
//
//val getMessage = lambda@ { response: Response ->
//    if(response.code !in 200..299) {
//        return@lambda “Error" // Return at labels
//    }
//    response.message
//}
//
//val getMessage = fun(response: Response): String {
//    if(response.code !in 200..299) {
//        return "Error"
//    }
//    return response.message
//}