package com.smlnskgmail.jaman.codewars.groovy.kyu7

class OddOrEvenTest extends GroovyTestCase {

    @SuppressWarnings("DuplicateListLiteral")
	void testOddOrEven() {
		assertEquals(
				'even',
				new OddOrEven([0]).solution()
		)
		assertEquals(
				'odd',
				new OddOrEven([1]).solution()
		)
		assertEquals(
				'even',
				new OddOrEven([0, 1, 5]).solution()
		)
		assertEquals(
				'even',
				new OddOrEven([]).solution()
		)
		assertEquals(
				'even',
				new OddOrEven().solution()
		)
		assertEquals(
				'even',
				new OddOrEven([0, 1, 3]).solution()
		)
		assertEquals(
				'even',
				new OddOrEven([1023, 1, 2]).solution()
		)
		assertEquals(
				'even',
				new OddOrEven([0, -1, -5]).solution()
		)
		assertEquals(
				'even',
				new OddOrEven([0, -1, -3]).solution()
		)
		assertEquals(
				'even',
				new OddOrEven([-1023, 1, -2]).solution()
		)
		assertEquals(
				'odd',
				new OddOrEven([0, 1, 2]).solution()
		)
		assertEquals(
				'odd',
				new OddOrEven([0, 1, 4]).solution()
		)
		assertEquals(
				'odd',
				new OddOrEven([1023, 1, 3]).solution()
		)
		assertEquals(
				'odd',
				new OddOrEven([0, -1, 2]).solution()
		)
		assertEquals(
				'odd',
				new OddOrEven([0, -1, 2]).solution()
		)
		assertEquals(
				'odd',
				new OddOrEven([0, 1, -4]).solution()
		)
		assertEquals(
				'odd',
				new OddOrEven([-1023, -1, 3]).solution()
		)
	}

}
