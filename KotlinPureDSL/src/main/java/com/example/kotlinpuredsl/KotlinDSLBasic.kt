package com.example.kotlinpuredsl

//data class Person(
//    var name: String? = null,
//    var age: Int? = null,
//    var address: Address? = null
//)
//
//
//data class Address(
//    var street: String? = null,
//    var number: Int? = null,
//    var city: String? = null
//)
//
//fun person(block: Person.() -> Unit): Person {
//    val p = Person()
//    p.block()
//    return p
//}
//
//fun Person.address(block: Address.() -> Unit) {
//    address = Address().apply(block)
//}
//
//fun main(args: Array<String>) {
//    val person = person {
//        name = "John"
//        age = 25
//        address {
//            street = "Main Street"
//            number = 42
//            city = "London"
//        }
//    }
//}