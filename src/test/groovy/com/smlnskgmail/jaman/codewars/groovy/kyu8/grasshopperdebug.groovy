package com.smlnskgmail.jaman.codewars.groovy.kyu8

class GrasshopperTest extends GroovyTestCase {

	void testKata() {
		assertEquals(
				'10 is above freezing temperature',
				Grasshopper.weatherInfo(50)
				)
		assertEquals(
				'-5 is freezing temperature',
				Grasshopper.weatherInfo(23)
				)
	}
}
