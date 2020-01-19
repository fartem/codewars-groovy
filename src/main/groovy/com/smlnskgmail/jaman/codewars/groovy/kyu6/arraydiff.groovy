package com.smlnskgmail.jaman.codewars.groovy.kyu6

/*
* https://www.codewars.com/kata/523f5d21c841566fde000009
* */
class ArrayDiff {

    private List<Integer> firstArray
    private List<Integer> secondArray

    ArrayDiff(firstArray, secondArray) {
        this.firstArray = firstArray
        this.secondArray = secondArray
    }

    List<Integer> result() {
        return firstArray - secondArray
    }

}