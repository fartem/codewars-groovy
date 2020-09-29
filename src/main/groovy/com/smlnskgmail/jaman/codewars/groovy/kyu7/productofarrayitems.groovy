package com.smlnskgmail.jaman.codewars.groovy.kyu7

import groovy.transform.TupleConstructor

// https://www.codewars.com/kata/5901f361927288d961000013
@TupleConstructor
class ProductOfArrayItems {

	List array

	Integer solution() {
		array ? array.inject { mul, acc -> mul * acc } as Integer : null
	}

}
