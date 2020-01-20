package com.smlnskgmail.jaman.codewars.groovy.kyu6

class ArrayDiffTest extends GroovyTestCase {

	void testResult() {
		assertEquals(
				[2],
				new ArrayDiff([1, 2], [1]).result()
				)
		assertEquals(
				[2, 2],
				new ArrayDiff([1, 2, 2], [1]).result()
				)
		assertEquals(
				[1],
				new ArrayDiff([1, 2, 2], [2]).result()
				)
		assertEquals(
				[1, 2, 2],
				new ArrayDiff([1, 2, 2], []).result()
				)
		assertEquals(
				[],
				new ArrayDiff([], [1, 2]).result()
				)
	}
}
