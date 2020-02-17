package com.smlnskgmail.jaman.codewars.groovy.kyu8

class AreaOrPerimeterTest extends GroovyTestCase {

    void testResult() {
        assertEquals(
                16,
                new AreaOrPerimeter(4, 4).result()
        )
        assertEquals(
                32,
                new AreaOrPerimeter(6, 10).result()
        )
        assertEquals(
                18,
                new AreaOrPerimeter(5, 4).result()
        )
        assertEquals(
                344,
                new AreaOrPerimeter(72, 100).result()
        )
    }

}