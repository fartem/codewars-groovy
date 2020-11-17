package com.smlnskgmail.jaman.codewars.groovy.kyu7

class RemoveBMWTest extends GroovyTestCase {

    void testResult() {
        assertEquals(
                'volvo',
                new RemoveBMW(
                        'bmwvolvoBMW'
                ).solution()
        )
    }

}
