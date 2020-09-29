package com.smlnskgmail.jaman.codewars.groovy.kyu7

class ABSwitchTest extends GroovyTestCase {

	void testResult() {
		assertEquals(
				'bac',
				new Switcheroo('abc').solution()
		)
		assertEquals(
				'bbbacccabbb',
				new Switcheroo('aaabcccbaaa').solution()
		)
		assertEquals(
				'ccccc',
				new Switcheroo('ccccc').solution()
		)
		assertEquals(
				'babababababababa',
				new Switcheroo('abababababababab').solution()
		)
		assertEquals(
				'bbbbb',
				new Switcheroo('aaaaa').solution()
		)
	}

}
