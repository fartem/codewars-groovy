package com.smlnskgmail.jaman.codewars.groovy.kyu8

class GenderTest extends GroovyTestCase {

	void testBasedOnChromosomes() {
		assertEquals(
				"Congratulations! You're going to have a son.",
				new DetermineOffspringSexBasedOnGenesXXAndXYChromosomes('XY').solution()
		)
		assertEquals(
				"Congratulations! You're going to have a daughter.",
				new DetermineOffspringSexBasedOnGenesXXAndXYChromosomes('XX').solution()
		)
	}

}
