package com.smlnskgmail.jaman.codewars.groovy.kyu5

class CustomArrayTest extends GroovyTestCase {

	void testInterleaving() {
		assertEquals(
				[1, "c", 2, "d", 3, "e"],
				new CustomArray([1, 2, 3], ["c", "d", "e"]).interleaving()
				)
		assertEquals(
				[1, 4, 2, 5, 3, null],
				new CustomArray([1, 2, 3], [4, 5]).interleaving()
				)
		assertEquals(
				[1, 4, 7, 2, 5, 8, 3, 6, 9],
				new CustomArray([1, 2, 3], [4, 5, 6], [7, 8, 9]).interleaving()
				)
		assertEquals(
				[],
				new CustomArray([]).interleaving()
				)
		assertEquals(
				[],
				new CustomArray().interleaving()
				)
	}
}
