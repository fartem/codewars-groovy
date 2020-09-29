package com.smlnskgmail.jaman.codewars.groovy.kyu5

class CustomArrayTest extends GroovyTestCase {

	void testInterleaving() {
		assertEquals(
				[1, "c", 2, "d", 3, "e"],
				new InterleavingArrays([1, 2, 3], ["c", "d", "e"]).solution()
		)
		assertEquals(
				[1, 4, 2, 5, 3, null],
				new InterleavingArrays([1, 2, 3], [4, 5]).solution()
		)
		assertEquals(
				[1, 4, 7, 2, 5, 8, 3, 6, 9],
				new InterleavingArrays([1, 2, 3], [4, 5, 6], [7, 8, 9]).solution()
		)
		assertEquals(
				[],
				new InterleavingArrays([]).solution()
		)
		assertEquals(
				[],
				new InterleavingArrays().solution()
		)
	}

}
