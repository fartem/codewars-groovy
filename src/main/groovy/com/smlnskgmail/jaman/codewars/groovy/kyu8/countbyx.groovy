package com.smlnskgmail.jaman.codewars.groovy.kyu8

import groovy.transform.TupleConstructor

// https://www.codewars.com/kata/5513795bd3fafb56c200049e
@TupleConstructor
class CountByX {

	Integer number
	Integer count

	List solution() {
		List result = []
		(1..count).forEach {
			result << it * number
		}
		result
	}

}
