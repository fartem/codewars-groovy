package com.smlnskgmail.jaman.codewars.groovy.kyu7

class ArrayProduct {

    private List<Integer> array

    ArrayProduct(List<Integer> array) {
        this.array = array
    }

    Integer product() {
        return array
                ? array.inject { mul, acc -> mul * acc }
                : null
    }

}