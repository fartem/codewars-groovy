package com.smlnskgmail.jaman.codewars.groovy.kyu7

class OnlyOneTest extends GroovyTestCase {

    void testResult() {
        assertEquals(
                false,
                new OnlyOne().result()
        )
        assertEquals(
                true,
                new OnlyOne(true, false, false).result()
        )
        assertEquals(
                false,
                new OnlyOne(true, false, false, true).result()
        )
        assertEquals(
                false,
                new OnlyOne(false, false, false, false).result()
        )
    }

}