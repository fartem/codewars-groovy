package com.smlnskgmail.jaman.codewars.groovy.kyu7

import groovy.transform.TupleConstructor

// https://www.codewars.com/kata/57fd696e26b06857eb0011e7
@TupleConstructor
class HungarianVowelsHarmonyEasy {

    String word

    String solution() {
        def front = ['e', 'é', 'i', 'í', 'ö', 'ő', 'ü', 'ű']
        def back = ['a', 'á', 'o', 'ó', 'u', 'ú']
        def vowels = word.split('').findAll {
            front.contains(it) || back.contains(it)
        }
        return word + (front.contains(vowels.last()) ? 'nek' : 'nak')
    }

}
