package com.smlnskgmail.jaman.codewars.groovy.kyu7

class ArrayProductTest extends GroovyTestCase {

	void testProduct() {
		assertEquals(
				540,
				new ArrayProduct([5, 4, 1, 3, 9]).product()
		)
		assertEquals(
				-672,
				new ArrayProduct([-2, 6, 7, 8]).product()
		)
		assertEquals(
				10,
				new ArrayProduct([10]).product()
		)
		assertEquals(
				0,
				new ArrayProduct([0, 2, 9, 7]).product()
		)
		assertEquals(
				null,
				new ArrayProduct(null).product()
		)
		assertEquals(
				null,
				new ArrayProduct([]).product()
		)
	}

}
