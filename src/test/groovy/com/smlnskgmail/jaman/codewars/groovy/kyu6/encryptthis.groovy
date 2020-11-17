package com.smlnskgmail.jaman.codewars.groovy.kyu6

class EncryptThisTest extends GroovyTestCase {

	void testEncrypt() {
		assertEquals(
				'65 119esi 111dl 111lw 108dvei 105n 97n 111ka',
				new EncryptThis('A wise old owl lived in an oak').solution()
		)
		assertEquals(
				'84eh 109ero 104e 115wa 116eh 108sse 104e 115eokp',
				new EncryptThis('The more he saw the less he spoke').solution()
		)
		assertEquals(
				'84eh 108sse 104e 115eokp 116eh 109ero 104e 104dare',
				new EncryptThis('The less he spoke the more he heard').solution()
		)
		assertEquals(
				'87yh 99na 119e 110to 97ll 98e 108eki 116tah 119esi 111dl 98dri',
				new EncryptThis('Why can we not all be like that wise old bird').solution()
		)
		assertEquals(
				'84kanh 121uo 80roti 102ro 97ll 121ruo 104ple',
				new EncryptThis('Thank you Piotr for all your help').solution()
		)
	}

}
