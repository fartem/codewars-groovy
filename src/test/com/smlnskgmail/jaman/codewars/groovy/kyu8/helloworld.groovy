package com.smlnskgmail.jaman.codewars.groovy.kyu8

class GreetTest extends GroovyTestCase {

    void testResult() {
        assertEquals(
                'hello world!',
                new Greet().greet()
        )
    }

}
