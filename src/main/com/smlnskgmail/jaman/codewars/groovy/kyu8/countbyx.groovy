package com.smlnskgmail.jaman.codewars.groovy.kyu8

class Count {

    Integer number
    Integer count

    Count(Integer number, Integer count) {
        this.number = number
        this.count = count
    }

    List result() {
        List result = []
        (1..count).forEach {
            result << it * number
        }
        return result
    }

}