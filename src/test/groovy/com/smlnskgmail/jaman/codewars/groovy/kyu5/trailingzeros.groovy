package com.smlnskgmail.jaman.codewars.groovy.kyu5

class TrailingZerosTest extends GroovyTestCase {

	void testZeros() {
		assertEquals(
				0,
				new NumberOfTrailingZeros(0).solution()
		)
		assertEquals(
				1,
				new NumberOfTrailingZeros(6).solution()
		)
		assertEquals(
				26875438,
				new NumberOfTrailingZeros(107501768).solution()
		)
	}

}
