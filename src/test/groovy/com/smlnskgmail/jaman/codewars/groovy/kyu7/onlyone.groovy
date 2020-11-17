package com.smlnskgmail.jaman.codewars.groovy.kyu7

class OnlyOneTest extends GroovyTestCase {

	@SuppressWarnings("DuplicateListLiteral")
	void testResult() {
		assertFalse(
				new OnlyOne().solution()
		)
		assertTrue(
				new OnlyOne(true, false, false).solution()
		)
		assertFalse(
				new OnlyOne(true, false, false, true).solution()
		)
		assertFalse(
				new OnlyOne(false, false, false, false).solution()
		)
	}

}
