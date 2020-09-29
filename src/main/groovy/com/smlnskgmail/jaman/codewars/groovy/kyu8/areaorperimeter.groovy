package com.smlnskgmail.jaman.codewars.groovy.kyu8

import groovy.transform.TupleConstructor

// https://www.codewars.com/kata/5ab6538b379d20ad880000ab
@TupleConstructor
class AreaOrPerimeter {

    Integer length
    Integer width

    Integer solution() {
        return length == width ? length * width : (length + width) * 2
    }

}