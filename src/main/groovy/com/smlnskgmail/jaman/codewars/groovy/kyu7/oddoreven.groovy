package com.smlnskgmail.jaman.codewars.groovy.kyu7

import groovy.transform.TupleConstructor

// https://www.codewars.com/kata/5949481f86420f59480000e7
@TupleConstructor
class OddOrEven {

	List input

	String solution() {
		(!input || input.sum() % 2 == 0) ? 'even' : 'odd'
	}

}
