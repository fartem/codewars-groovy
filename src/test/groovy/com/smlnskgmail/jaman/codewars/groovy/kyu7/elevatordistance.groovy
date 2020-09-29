package com.smlnskgmail.jaman.codewars.groovy.kyu7

class ElevatorDistanceTest extends GroovyTestCase {

	void testDistance() {
		assertEquals(
				9,
				new ElevatorDistance([5, 2, 8]).solution()
		)
		assertEquals(
				2,
				new ElevatorDistance([1, 2, 3]).solution()
		)
		assertEquals(
				18,
				new ElevatorDistance([7, 1, 7, 1]).solution()
		)
	}

}
