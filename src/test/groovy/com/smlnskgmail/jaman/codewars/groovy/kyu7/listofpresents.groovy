package com.smlnskgmail.jaman.codewars.groovy.kyu7

class ListOfPresentsTest extends GroovyTestCase {

    void testHowManyCounts() {
        assertEquals(
                4,
                new ListOfPresents(
                        20,
                        [13, 2, 4, 6, 1]
                ).solution()
        )
        assertEquals(
                8,
                new ListOfPresents(
                        90,
                        [87, 3, 5, 25, 1, 3, 4, 6, 20]
                ).solution()
        )
        assertEquals(
                9,
                new ListOfPresents(
                        100,
                        [6, 94, 10, 45, 2, 4, 5, 6, 8, 1]
                ).solution()
        )
        assertEquals(
                0,
                new ListOfPresents(
                        0,
                        [1]
                ).solution()
        )
        assertEquals(
                12,
                new ListOfPresents(
                        90,
                        [10, 10, 10, 10, 10, 10, 5, 5, 5, 5, 5, 5]
                ).solution()
        )
    }

}
