package com.smlnskgmail.jaman.codewars.groovy.kyu6

class ArrayDiffTest extends GroovyTestCase {

	@SuppressWarnings("DuplicateListLiteral")
	void testResult() {
		assertEquals(
				[2],
				new ArrayDiff([1, 2], [1]).solution()
		)
		assertEquals(
				[2, 2],
				new ArrayDiff([1, 2, 2], [1]).solution()
		)
		assertEquals(
				[1],
				new ArrayDiff([1, 2, 2], [2]).solution()
		)
		assertEquals(
				[1, 2, 2],
				new ArrayDiff([1, 2, 2], []).solution()
		)
		assertEquals(
				[],
				new ArrayDiff([], [1, 2]).solution()
		)
	}

}
