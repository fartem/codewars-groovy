package com.smlnskgmail.jaman.codewars.groovy.kyu7

/*
* https://www.codewars.com/kata/5b2117eea454c89d4400005f
* */
class LeonardoNumbers {

    private counter
    private l0
    private l1
    private addNumber

    LeonardoNumbers(counter, l0, l1, addNumber) {
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
        result
    }

}