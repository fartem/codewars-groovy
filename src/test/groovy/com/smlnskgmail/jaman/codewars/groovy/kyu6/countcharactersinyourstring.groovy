package com.smlnskgmail.jaman.codewars.groovy.kyu6

class CountCharactersInYourStringTest extends GroovyTestCase {

	void testCount() {
		assertEquals(
				['a': 2, 'b': 1],
				new CountCharactersInYourString('aba').solution()
		)
		assertEquals(
				[:],
				new CountCharactersInYourString('').solution()
		)
	}

}
