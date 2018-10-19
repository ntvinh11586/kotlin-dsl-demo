package com.example.kotlinpuredsl

//inline fun higherOrderFunction(crossinline lambda: () -> Unit) {
//    normalFunction { lambda() }
//}
//
//fun normalFunction(func: () -> Unit) {
//    return
//}
//
//fun callingFunction() {
//    higherOrderFunction {
//        return  //Error. Can't return from here.
//    }
//}