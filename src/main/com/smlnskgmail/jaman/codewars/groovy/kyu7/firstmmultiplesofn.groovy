package com.smlnskgmail.jaman.codewars.groovy.kyu7

/*
* https://www.codewars.com/kata/593c9175933500f33400003e
* */
class Multiple {

    private m
    private n

    Multiple(m, n) {
        this.m = m
        this.n = n
    }

    List result() {
        (1..m).collect {
            it * n
        }
    }

}