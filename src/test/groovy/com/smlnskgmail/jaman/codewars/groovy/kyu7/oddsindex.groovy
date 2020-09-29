package com.smlnskgmail.jaman.codewars.groovy.kyu7

class OddTest extends GroovyTestCase {

    void testOddBall() {
        assertTrue(
                new OddsIndex(
                        ["even", 4, "even", 7, "even", 55, "even", 6, "even", 10, "odd", 3, "even"]
                ).solution()
        )
        assertFalse(
                new OddsIndex(
                        ["even", 4, "even", 7, "even", 55, "even", 6, "even", 9, "odd", 3, "even"]
                ).solution()
        )
        assertTrue(
                new OddsIndex(
                        ["even", 10, "odd", 2, "even"]
                ).solution()
        )
    }

}
