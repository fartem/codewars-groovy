package com.smlnskgmail.jaman.codewars.groovy.kyu7

import groovy.transform.TupleConstructor

// https://www.codewars.com/kata/52f3149496de55aded000410
@TupleConstructor
class SummingANumbersDigits {

	Integer number

	Integer solution() {
		Math.abs(number)
				.toString()
				.split('')
				.sum { it -> Integer.valueOf(it) } as Integer
	}

}
