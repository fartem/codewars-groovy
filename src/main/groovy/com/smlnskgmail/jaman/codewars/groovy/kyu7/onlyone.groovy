package com.smlnskgmail.jaman.codewars.groovy.kyu7

import groovy.transform.TupleConstructor

/*
 * https://www.codewars.com/kata/5734c38da41454b7f700106e
 */
@TupleConstructor
class OnlyOne {

	Boolean[] input

	boolean result() {
		input && input.count(true) == 1
	}

}
