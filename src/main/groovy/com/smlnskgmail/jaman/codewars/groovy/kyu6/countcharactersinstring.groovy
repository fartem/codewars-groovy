package com.smlnskgmail.jaman.codewars.groovy.kyu6

import groovy.transform.TupleConstructor

// https://www.codewars.com/kata/52efefcbcdf57161d4000091
@TupleConstructor
class CountCharactersInString {

	String input

	Map solution() {
		input.iterator().countBy { it }
	}

}
