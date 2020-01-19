package com.smlnskgmail.jaman.codewars.groovy.kyu6

/*
* https://www.codewars.com/kata/523f5d21c841566fde000009
* */
class ArrayDiff {

    private firstArray
    private secondArray

    ArrayDiff(firstArray, secondArray) {
        this.firstArray = firstArray
        this.secondArray = secondArray
    }

    List result() {
        firstArray - secondArray
    }

}