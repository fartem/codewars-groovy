package com.smlnskgmail.jaman.codewars.groovy.kyu7

import groovy.transform.TupleConstructor

// https://www.codewars.com/kata/593c9175933500f33400003e
@TupleConstructor
class ReturnTheFirstMMultiplesOfN {

	Integer m
	Integer n

	List solution() {
		(1..m).collect {
			it * n
		}
	}

}
