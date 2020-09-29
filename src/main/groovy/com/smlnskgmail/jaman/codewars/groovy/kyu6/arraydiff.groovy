package com.smlnskgmail.jaman.codewars.groovy.kyu6

import groovy.transform.TupleConstructor

// https://www.codewars.com/kata/523f5d21c841566fde000009
@TupleConstructor
class ArrayDiff {

	List firstArray
	List secondArray

	List solution() {
		firstArray - secondArray
	}

}
