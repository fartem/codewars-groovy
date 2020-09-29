package com.smlnskgmail.jaman.codewars.groovy.kyu7

class LeonardoNumbersTest extends GroovyTestCase {

	void testForCount() {
		assertEquals(
				[1, 1, 3, 5, 9],
				new LeonardoNumbers(5, 1, 1, 1).solution()
		)
		assertEquals(
				[0, 0, 2, 4, 8],
				new LeonardoNumbers(5, 0, 0, 2).solution()
		)
		assertEquals(
				[0, 0, 0, 0, 0],
				new LeonardoNumbers(5, 0, 0, 0).solution()
		)
	}

}
