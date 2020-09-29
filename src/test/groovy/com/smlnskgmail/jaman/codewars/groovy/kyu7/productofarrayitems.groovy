package com.smlnskgmail.jaman.codewars.groovy.kyu7

class ArrayProductTest extends GroovyTestCase {

	void testProduct() {
		assertEquals(
				540,
				new ProductOfArrayItems([5, 4, 1, 3, 9]).solution()
		)
		assertEquals(
				-672,
				new ProductOfArrayItems([-2, 6, 7, 8]).solution()
		)
		assertEquals(
				10,
				new ProductOfArrayItems([10]).solution()
		)
		assertEquals(
				0,
				new ProductOfArrayItems([0, 2, 9, 7]).solution()
		)
		assertEquals(
				null,
				new ProductOfArrayItems(null).solution()
		)
		assertEquals(
				null,
				new ProductOfArrayItems([]).solution()
		)
	}

}
