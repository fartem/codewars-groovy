package com.smlnskgmail.jaman.codewars.groovy.kyu7

/*
* https://www.codewars.com/kata/5949481f86420f59480000e7
* */
class Sum {

    private List input

    Sum(List input) {
        this.input = input
    }

    String oddOrEven() {
        if (input == null || input.isEmpty()) {
            return 'even'
        }
        return input.sum() % 2 == 0 ? 'even' : 'odd'
    }

}