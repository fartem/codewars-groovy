package com.smlnskgmail.jaman.codewars.groovy.kyu8

class GrasshopperDebugTest extends GroovyTestCase {

	void testKata() {
		assertEquals(
				'10 is above freezing temperature',
				GrasshopperDebug.solution(50)
		)
		assertEquals(
				'-5 is freezing temperature',
				GrasshopperDebug.solution(23)
		)
	}

}
