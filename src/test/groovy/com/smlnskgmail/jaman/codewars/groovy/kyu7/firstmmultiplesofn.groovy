package com.smlnskgmail.jaman.codewars.groovy.kyu7

class MultipleTest extends GroovyTestCase {

	void testResult() {
		assertEquals(
				[5, 10, 15],
				new Multiple(3, 5).result()
		)
	}

}
