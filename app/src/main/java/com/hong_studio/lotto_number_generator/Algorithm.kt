package com.hong_studio.lotto_number_generator

fun main(args: Array<String>) {

    val list = mutableListOf<Int>().apply {
        for (i in 1..45){
            this.add(i)
        }
    }

    list.shuffle()

    println(list.subList(0, 6))

}