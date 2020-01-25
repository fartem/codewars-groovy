package com.smlnskgmail.jaman.codewars.groovy.kyu7

class ElevatorDistanceTest extends GroovyTestCase {

	void testDistance() {
		assertEquals(
				9,
				new ElevatorDistance([5, 2, 8]).distance()
		)
		assertEquals(
				2,
				new ElevatorDistance([1, 2, 3]).distance()
		)
		assertEquals(
				18,
				new ElevatorDistance([7, 1, 7, 1]).distance()
		)
	}

}
