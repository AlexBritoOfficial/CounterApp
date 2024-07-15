package com.example.counter

import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class CounterViewModel() : ViewModel() {

    private val counterModelRepository: CounterModelRepository = CounterModelRepository()
    private var _counter = mutableStateOf(counterModelRepository.getCounter().count)

    val counter: MutableState<Int> = _counter

    fun decrement() {
        counterModelRepository.decrementCounter()
        _counter.value = counterModelRepository.getCounter().count
    }

    fun increment() {
        counterModelRepository.incrementCounter()
        _counter.value = counterModelRepository.getCounter().count
    }
}