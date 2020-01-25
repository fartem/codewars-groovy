package com.smlnskgmail.jaman.codewars.groovy.kyu5

class TrailingZerosTest extends GroovyTestCase {

	void testZeros() {
		assertEquals(
				0,
				new TrailingZeros(0).zerosCount()
		)
		assertEquals(
				1,
				new TrailingZeros(6).zerosCount()
		)
		assertEquals(
				26875438,
				new TrailingZeros(107501768).zerosCount()
		)
	}

}
