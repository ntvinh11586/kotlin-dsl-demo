package com.example.kotlinpuredsl

class Benchmark {

    fun benchmark(block: () -> Unit): Long {
        val startTime = System.currentTimeMillis()
        block.invoke()
        return System.currentTimeMillis() - startTime
    }
}