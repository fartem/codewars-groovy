package com.smlnskgmail.jaman.codewars.groovy.kyu8

class CountTest extends GroovyTestCase {

	void testResult() {
		assertEquals(
				[1, 2, 3, 4, 5],
				new CountByX(1, 5).solution()
		)
		assertEquals(
				[2, 4, 6, 8, 10],
				new CountByX(2, 5).solution()
		)
		assertEquals(
				[3, 6, 9, 12, 15],
				new CountByX(3, 5).solution()
		)
		assertEquals(
				[50, 100, 150, 200, 250],
				new CountByX(50, 5).solution()
		)
		assertEquals(
				[100, 200, 300, 400, 500],
				new CountByX(100, 5).solution()
		)
	}

}
