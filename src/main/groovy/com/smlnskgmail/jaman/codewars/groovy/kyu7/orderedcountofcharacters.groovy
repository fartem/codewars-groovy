package com.smlnskgmail.jaman.codewars.groovy.kyu7

import groovy.transform.TupleConstructor

/*
 * https://www.codewars.com/kata/57a6633153ba33189e000074
 */
@TupleConstructor
class Characters {

    String input

    List orderedCount() {
        input.iterator().countBy { it }.collect {
            return new Tuple(it.key, it.value)
        }
    }

}