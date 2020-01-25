package com.smlnskgmail.jaman.codewars.groovy.kyu7

import groovy.transform.TupleConstructor

/*
 * https://www.codewars.com/kata/5949481f86420f59480000e7
 */
@TupleConstructor
class Sum {

	List input

	String oddOrEven() {
		(!input || input.sum() % 2 == 0) ? 'even' : 'odd'
	}

}
