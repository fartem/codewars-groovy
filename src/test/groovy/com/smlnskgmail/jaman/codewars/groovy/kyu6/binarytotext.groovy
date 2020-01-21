package com.smlnskgmail.jaman.codewars.groovy.kyu6

class TextTest extends GroovyTestCase {

	void testFromBinary() {
		assertEquals(
				'Hello',
				new Text('0100100001100101011011000110110001101111').fromBinary()
				)
		assertEquals(
				'1011',
				new Text('00110001001100000011000100110001').fromBinary()
				)
	}
}
