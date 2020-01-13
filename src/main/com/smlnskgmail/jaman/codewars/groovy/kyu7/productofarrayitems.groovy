package com.smlnskgmail.jaman.codewars.groovy.kyu7

class ArrayProduct {

    private List<Integer> array

    ArrayProduct(List<Integer> array) {
        this.array = array
    }

    Integer product() {
        return !array
                ? null
                : array.stream().reduce(1, { i1, i2 -> i1 * i2 })
    }

}