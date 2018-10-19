package com.example.kotlinpuredsl

//class Person {
//    fun move() {}
//}
//
//class NetworkRepository(val person: Person) {
//
//    fun loadData() {}
//
//    fun move() {}
//
//    fun doSomething() {
//        person.uploadToBackend(); // We can access extension here
//    }
//
//
//    fun Person.uploadToBackend() {
//
//        //method from extension dispatch receiver
//        loadData()
//
//        //method from extension receiver
//        // calls method defined in Person class
//        move()
//
//        // calls method defined in NetworkRepository class
//        this@NetworkRepository.move()
//
//    }
//}
//
//
//val person = Person()
//person.uploadToBackend() // Compilation error