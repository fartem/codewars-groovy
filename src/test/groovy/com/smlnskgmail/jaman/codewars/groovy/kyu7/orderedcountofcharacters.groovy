package com.smlnskgmail.jaman.codewars.groovy.kyu7

class CharacterTest extends GroovyTestCase {

    void testOrderedCount() {
        assertEquals(
                [['a', 5], ['b', 2], ['r', 2], ['c', 1], ['d', 1]],
                new OrderedCountOfCharacters('abracadabra').solution()
        )
        assertEquals(
                [['C', 1], ['o', 1], ['d', 1], ['e', 1], [' ', 1], ['W', 1], ['a', 1], ['r', 1], ['s', 1]],
                new OrderedCountOfCharacters('Code Wars').solution()
        )
    }

}
