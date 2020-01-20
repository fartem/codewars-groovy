package com.smlnskgmail.jaman.codewars.groovy.kyu7

class NumbersSumTest extends GroovyTestCase {

	void testSum() {
		assertEquals(
				1,
				new NumbersSum(10).value()
				)
		assertEquals(
				18,
				new NumbersSum(99).value()
				)
		assertEquals(
				5,
				new NumbersSum(-32).value()
				)
	}
}
