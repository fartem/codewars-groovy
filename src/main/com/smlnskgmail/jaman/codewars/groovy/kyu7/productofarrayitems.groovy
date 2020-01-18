package com.smlnskgmail.jaman.codewars.groovy.kyu7

class ArrayProduct {

    private array

    ArrayProduct(array) {
        this.array = array
    }

    Integer product() {
        array ? array.inject { mul, acc -> mul * acc } : null
    }

}