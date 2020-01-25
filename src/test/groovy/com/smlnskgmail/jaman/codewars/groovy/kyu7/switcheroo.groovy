package com.smlnskgmail.jaman.codewars.groovy.kyu7

class ABSwitchTest extends GroovyTestCase {

	void testResult() {
		assertEquals(
				'bac',
				new ABSwitch('abc').result()
		)
		assertEquals(
				'bbbacccabbb',
				new ABSwitch('aaabcccbaaa').result()
		)
		assertEquals(
				'ccccc',
				new ABSwitch('ccccc').result()
		)
		assertEquals(
				'babababababababa',
				new ABSwitch('abababababababab').result()
		)
		assertEquals(
				'bbbbb',
				new ABSwitch('aaaaa').result()
		)
	}

}
