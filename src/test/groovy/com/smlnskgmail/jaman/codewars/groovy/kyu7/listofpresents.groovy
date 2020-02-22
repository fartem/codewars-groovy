package com.smlnskgmail.jaman.codewars.groovy.kyu7

class PresentsTest extends GroovyTestCase {

    void testHowManyCounts() {
        assertEquals(
                4,
                new Presents(
                        20,
                        [13, 2, 4, 6, 1]
                ).howManyGifts()
        )
        assertEquals(
                8,
                new Presents(
                        90,
                        [87, 3, 5, 25, 1, 3, 4, 6, 20]
                ).howManyGifts()
        )
        assertEquals(
                9,
                new Presents(
                        100,
                        [6, 94, 10, 45, 2, 4, 5, 6, 8, 1]
                ).howManyGifts()
        )
        assertEquals(
                0,
                new Presents(
                        0,
                        [1]
                ).howManyGifts()
        )
        assertEquals(
                12,
                new Presents(
                        90,
                        [10, 10, 10, 10, 10, 10, 5, 5, 5, 5, 5, 5]
                ).howManyGifts()
        )
    }

}
