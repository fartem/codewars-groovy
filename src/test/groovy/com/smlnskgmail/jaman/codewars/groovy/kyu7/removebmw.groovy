package com.smlnskgmail.jaman.codewars.groovy.kyu7

class BMWRemoverTest extends GroovyTestCase {

    void testResult() {
        assertEquals(
                'volvo',
                new RemoveBMW(
                        'bmwvolvoBMW'
                ).solution()
        )
    }

}
