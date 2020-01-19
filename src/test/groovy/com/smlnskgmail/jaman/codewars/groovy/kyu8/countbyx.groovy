package com.smlnskgmail.jaman.codewars.groovy.kyu8

class CountTest extends GroovyTestCase {

    void testResult() {
        assertEquals(
                [1, 2, 3, 4, 5],
                new Count(1, 5).result()
        )
        assertEquals(
                [2, 4, 6, 8, 10],
                new Count(2, 5).result()
        )
        assertEquals(
                [3, 6, 9, 12, 15],
                new Count(3, 5).result()
        )
        assertEquals(
                [50, 100, 150, 200, 250],
                new Count(50, 5).result()
        )
        assertEquals(
                [100, 200, 300, 400, 500],
                new Count(100, 5).result()
        )
    }

}
