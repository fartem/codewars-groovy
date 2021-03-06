package com.smlnskgmail.jaman.codewars.groovy.kyu5

import groovy.transform.TupleConstructor

// https://www.codewars.com/kata/52f787eb172a8b4ae1000a34
@TupleConstructor
class NumberOfTrailingZeros {

	Integer number

	Integer solution() {
		Integer result = 0
		for (int i = 5; number / i >= 1; i *= 5) {
			result += number / i
		}
		result
	}

}
