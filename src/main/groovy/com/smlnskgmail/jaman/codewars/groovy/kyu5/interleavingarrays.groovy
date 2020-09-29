package com.smlnskgmail.jaman.codewars.groovy.kyu5

import groovy.transform.TupleConstructor

// https://www.codewars.com/kata/523d2e964680d1f749000135
@TupleConstructor
class InterleavingArrays {

	List[] arrays

	List solution() {
		def result = []
		if (arrays) {
			def iterators = arrays.collect { it.iterator() }
			arrays.max { it.size() }.size().times {
				iterators.each {
					result << (it.hasNext() ? it.next() : null)
				}
			}
		}
		result
	}

}
