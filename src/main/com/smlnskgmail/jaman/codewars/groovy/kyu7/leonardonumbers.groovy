package com.smlnskgmail.jaman.codewars.groovy.kyu7

/*
* https://www.codewars.com/kata/5b2117eea454c89d4400005f
* */
class LeonardoNumbers {

    private int counter
    private int l0
    private int l1
    private int addNumber

    LeonardoNumbers(
            int counter,
            int l0,
            int l1,
            int addNumber
    ) {
        this.counter = counter
        this.l0 = l0
        this.l1 = l1
        this.addNumber = addNumber
    }

    List forCount() {
        List result = [l0, l1]
        (2..<counter).forEach {
            result << result[it - 1] + result[it - 2] + addNumber
        }
        return result
    }

}