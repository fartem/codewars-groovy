package com.smlnskgmail.jaman.codewars.groovy.kyu6

class CharactersTest extends GroovyTestCase {

	void testCount() {
		assertEquals(
				['a': 2, 'b': 1],
				new Characters('aba').count()
		)
		assertEquals(
				[:],
				new Characters('').count()
		)
	}

}