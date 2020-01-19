package com.smlnskgmail.jaman.codewars.groovy.kyu7

/*
* https://www.codewars.com/kata/52f3149496de55aded000410
* */
class NumbersSum {

    private Integer number

    NumbersSum(Integer number) {
        this.number = number
    }

    Integer value() {
        return Math.abs(number).toString().split('').sum { it -> Integer.valueOf(it) }
    }

}