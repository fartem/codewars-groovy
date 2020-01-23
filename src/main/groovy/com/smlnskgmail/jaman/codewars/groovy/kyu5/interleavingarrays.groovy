package com.smlnskgmail.jaman.codewars.groovy.kyu5

/*
* https://www.codewars.com/kata/523d2e964680d1f749000135
* */
class CustomArray {

    private List<List> arrays

    CustomArray(List ...arrays) {
        this.arrays = arrays
    }

    List interleaving() {
        def result = []
        if (arrays) {
            def iterators = arrays.collect { it.iterator() }
            arrays.max { it.size() }.size().times {
                iterators.each {
                    result << (it.hasNext() ? it.next() : null)
                }
            }
        }
        result
    }

}