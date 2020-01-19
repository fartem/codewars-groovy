package com.smlnskgmail.jaman.codewars.groovy.kyu7

class SumTest extends GroovyTestCase {

    void testOddOrEven() {
        assertEquals(
                'even',
                new Sum([0]).oddOrEven()
        )
        assertEquals(
                'odd',
                new Sum([1]).oddOrEven()
        )
        assertEquals(
                'even',
                new Sum([0, 1, 5]).oddOrEven()
        )
        assertEquals(
                'even',
                new Sum([]).oddOrEven()
        )
        assertEquals(
                'even',
                new Sum().oddOrEven()
        )
        assertEquals(
                'even',
                new Sum([0, 1, 3]).oddOrEven()
        )
        assertEquals(
                'even',
                new Sum([1023, 1, 2]).oddOrEven()
        )
        assertEquals(
                'even',
                new Sum([0, -1, -5]).oddOrEven()
        )
        assertEquals(
                'even',
                new Sum([0, -1, -3]).oddOrEven()
        )
        assertEquals(
                'even',
                new Sum([-1023, 1, -2]).oddOrEven()
        )
        assertEquals(
                'odd',
                new Sum([0, 1, 2]).oddOrEven()
        )
        assertEquals(
                'odd',
                new Sum([0, 1, 4]).oddOrEven()
        )
        assertEquals(
                'odd',
                new Sum([1023, 1, 3]).oddOrEven()
        )
        assertEquals(
                'odd',
                new Sum([0, -1, 2]).oddOrEven()
        )
        assertEquals(
                'odd',
                new Sum([0, -1, 2]).oddOrEven()
        )
        assertEquals(
                'odd',
                new Sum([0, 1, -4]).oddOrEven()
        )
        assertEquals(
                'odd',
                new Sum([-1023, -1, 3]).oddOrEven()
        )
    }

}