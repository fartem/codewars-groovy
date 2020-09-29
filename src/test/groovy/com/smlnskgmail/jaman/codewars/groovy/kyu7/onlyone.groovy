package com.smlnskgmail.jaman.codewars.groovy.kyu7

class OnlyOneTest extends GroovyTestCase {

	void testResult() {
		assertEquals(
				false,
				new OnlyOne().solution()
		)
		assertEquals(
				true,
				new OnlyOne(true, false, false).solution()
		)
		assertEquals(
				false,
				new OnlyOne(true, false, false, true).solution()
		)
		assertEquals(
				false,
				new OnlyOne(false, false, false, false).solution()
		)
	}

}
