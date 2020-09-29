package com.smlnskgmail.jaman.codewars.groovy.kyu7

import groovy.transform.TupleConstructor

// https://www.codewars.com/kata/5b2117eea454c89d4400005f
@TupleConstructor
class LeonardoNumbers {

	Integer counter
	Integer l0
	Integer l1
	Integer addNumber

	List solution() {
		List result = [l0, l1]
		(2..<counter).forEach {
			result << result[it - 1] + result[it - 2] + addNumber
		}
		result
	}

}
