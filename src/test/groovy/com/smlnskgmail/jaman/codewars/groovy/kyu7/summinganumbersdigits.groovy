package com.smlnskgmail.jaman.codewars.groovy.kyu7

class NumbersSumTest extends GroovyTestCase {

	void testSum() {
		assertEquals(
				1,
				new SummingANumbersDigits(10).solution()
		)
		assertEquals(
				18,
				new SummingANumbersDigits(99).solution()
		)
		assertEquals(
				5,
				new SummingANumbersDigits(-32).solution()
		)
	}

}
