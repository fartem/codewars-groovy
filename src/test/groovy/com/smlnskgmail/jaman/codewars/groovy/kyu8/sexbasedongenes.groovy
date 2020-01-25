package com.smlnskgmail.jaman.codewars.groovy.kyu8

class GenderTest extends GroovyTestCase {

	void testBasedOnChromosomes() {
		assertEquals(
				"Congratulations! You're going to have a son.",
				new Gender('XY').basedOnChromosomes()
		)
		assertEquals(
				"Congratulations! You're going to have a daughter.",
				new Gender('XX').basedOnChromosomes()
		)
	}

}
