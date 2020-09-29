package com.smlnskgmail.jaman.codewars.groovy.kyu6

class CharactersTest extends GroovyTestCase {

	void testCount() {
		assertEquals(
				['a': 2, 'b': 1],
				new CountCharactersInString('aba').solution()
		)
		assertEquals(
				[:],
				new CountCharactersInString('').solution()
		)
	}

}
