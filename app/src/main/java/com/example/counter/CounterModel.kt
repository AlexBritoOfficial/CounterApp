package com.example.counter

data class CounterModel(var count: Int)

class CounterModelRepository{

    private val counter = CounterModel(0)

    fun getCounter() = counter

    fun incrementCounter() = counter.count++

    fun decrementCounter() = counter.count--

}