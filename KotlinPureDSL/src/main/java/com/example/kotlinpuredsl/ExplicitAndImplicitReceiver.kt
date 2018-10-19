package com.example.kotlinpuredsl

//interface A {
//    fun doSomething() {
//        println("A is doing something")
//    }
//}
//
//interface B {
//    fun doSomething() {
//        println("B is doing something")
//    }
//}
//
//class Test : A, B {
//    override fun doSomething() {
//        doSomething() // infinitely recursive call
//    }
//}
//
//class Test : A, B {
//    override fun doSomething() {
//        super<A>.doSomething() // explicit receiver
//        super<B>.doSomething() // explicit receiver
//    }
//}
