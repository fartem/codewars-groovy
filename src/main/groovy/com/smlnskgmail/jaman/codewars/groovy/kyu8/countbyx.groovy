package com.smlnskgmail.jaman.codewars.groovy.kyu8

import groovy.transform.TupleConstructor

/*
 * https://www.codewars.com/kata/5513795bd3fafb56c200049e
 */
@TupleConstructor
class Count {

	Integer number
	Integer count

	List result() {
		List result = []
		(1..count).forEach {
			result << it * number
		}
		result
	}

}
