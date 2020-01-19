package com.smlnskgmail.jaman.codewars.groovy.kyu7

/*
* https://www.codewars.com/kata/593c9175933500f33400003e
* */
class Multiple {

    private Integer m
    private Integer n

    Multiple(Integer m, Integer n) {
        this.m = m
        this.n = n
    }

    List result() {
        return (1..m).collect {
            it * n
        }
    }

}