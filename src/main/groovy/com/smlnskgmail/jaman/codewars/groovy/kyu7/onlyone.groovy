package com.smlnskgmail.jaman.codewars.groovy.kyu7

/*
* https://www.codewars.com/kata/5734c38da41454b7f700106e
* */
class OnlyOne {

    private boolean[] input

    OnlyOne(boolean[] input) {
        this.input = input
    }

    boolean result() {
        return input.count(true) == 1
    }

}