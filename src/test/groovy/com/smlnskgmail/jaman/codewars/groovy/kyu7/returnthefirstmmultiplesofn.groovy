package com.smlnskgmail.jaman.codewars.groovy.kyu7

class ReturnTheFirstMMultiplesOfNTest extends GroovyTestCase {

	void testResult() {
		assertEquals(
				[5, 10, 15],
				new ReturnTheFirstMMultiplesOfN(3, 5).solution()
		)
	}

}
