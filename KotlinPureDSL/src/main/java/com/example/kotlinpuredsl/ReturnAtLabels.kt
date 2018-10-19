package com.example.kotlinpuredsl

//fun foo() {
//    listOf(1, 2, 3, 4, 5).forEach {
//        // non-local return directly to the caller of foo()
//        if (it == 3) return
//        print(it)
//    }
//    println("this point is unreachable")
//}
//
//fun foo() {
//    listOf(1, 2, 3, 4, 5).forEach lit@ {
//        // local return to the caller of the lambda, i.e. the forEach loop
//        if (it == 3) return@lit
//        print(it)
//    }
//    print("done with explicit label")
//}
//
//val getMessage = lambda@ { response: Response ->
//    if(response.code !in 200..299) {
//        return@lambda “Error" // Return at labels
//    }
//    response.message
//}