package com.smlnskgmail.jaman.codewars.groovy.kyu8

class FunctionOneHelloWorldTest extends GroovyTestCase {

	void testResult() {
		assertEquals(
				'hello world!',
				new FunctionOneHelloWorld().solution()
		)
	}

}
