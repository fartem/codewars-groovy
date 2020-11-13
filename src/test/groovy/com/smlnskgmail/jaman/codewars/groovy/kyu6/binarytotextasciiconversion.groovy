package com.smlnskgmail.jaman.codewars.groovy.kyu6

class TextTest extends GroovyTestCase {

	void testFromBinary() {
		assertEquals(
				'Hello',
				new BinaryToTextASCIIConversion('0100100001100101011011000110110001101111').solution()
		)
		assertEquals(
				'1011',
				new BinaryToTextASCIIConversion('00110001001100000011000100110001').solution()
		)
	}

}
