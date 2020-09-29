package com.smlnskgmail.jaman.codewars.groovy.kyu7

import groovy.transform.TupleConstructor

// https://www.codewars.com/kata/5a941f4e1a60f6e8a70025fe
@TupleConstructor
class OddsIndex {

    List input

    Boolean solution() {
        input.indexOf('odd') in input
    }

}
