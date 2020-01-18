package com.smlnskgmail.jaman.codewars.groovy.kyu8

/*
* https://www.codewars.com/kata/5513795bd3fafb56c200049e
* */
class Count {

    private number
    private count

    Count(number, count) {
        this.number = number
        this.count = count
    }

    List result() {
        List result = []
        (1..count).forEach {
            result << it * number
        }
        result
    }

}