package com.example.kotlinpuredsl

//import java.text.SimpleDateFormat
//import java.util.*
//
//data class Person(
//    val name: String,
//    val dateOfBirth: Date,
//    val addresses: List<Address>
//)
//
//data class Address(
//    val street: String,
//    val number: Int,
//    val city: String
//)
//
//class PersonBuilder {
//
//    var name: String = ""
//
//    private var dob: Date = Date()
//
//    var dateOfBirth: String = ""
//        set(value) {
//            dob = SimpleDateFormat("yyyy-MM-dd").parse(value)
//        }
//
//    private val addresses = mutableListOf<Address>()
//
//    fun addresses(block: ADDRESSES.() -> Unit) {
//        addresses.addAll(ADDRESSES().apply(block))
//    }
//
//    fun build(): Person = Person(name, dob, addresses)
//}
//
//class AddressBuilder {
//
//    var street: String = ""
//
//    var number: Int = 0
//
//    var city: String = ""
//
//    fun build(): Address = Address(street, number, city)
//}
//
//class ADDRESSES: ArrayList<Address>() {
//
//    fun address(block: AddressBuilder.() -> Unit) {
//        add(AddressBuilder().apply(block).build())
//    }
//}
//
//fun person(block: PersonBuilder.() -> Unit): Person =
//    PersonBuilder().apply(block).build()
//
//fun main(args: Array<String>) {
//    val person = person {
//        name = "John"
//        dateOfBirth = "1980-12-01"
//        addresses {
//            address {
//                addresses {
//                    name = "Mary" // access outer scope lambda
//                }
//                street = "Dev Avenue"
//                number = 42
//                city = "Paris"
//            }
//        }
//    }
//}