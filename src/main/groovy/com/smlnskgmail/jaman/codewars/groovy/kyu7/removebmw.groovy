package com.smlnskgmail.jaman.codewars.groovy.kyu7

import groovy.transform.TupleConstructor

// https://www.codewars.com/kata/59de795c289ef9197f000c48
@TupleConstructor
class RemoveBMW {

    def input

    @SuppressWarnings("Instanceof")
    String solution() {
        if (!(input instanceof String)) {
            throw new IllegalArgumentException(
                    "This program only works for text."
            )
        }
        return input.replaceAll('(?i)[bmw]', '')
    }

}
