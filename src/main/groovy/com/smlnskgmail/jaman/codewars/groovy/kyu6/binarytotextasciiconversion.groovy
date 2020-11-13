package com.smlnskgmail.jaman.codewars.groovy.kyu6

import groovy.transform.TupleConstructor

// https://www.codewars.com/kata/5583d268479559400d000064
@TupleConstructor
class BinaryToTextASCIIConversion {

	String input

	String solution() {
		input.toList()
				.collate(8)
				.stream()
				.map({ v -> (char) Integer.parseInt(v.join(''), 2) })
				.collect()
				.join('')
	}

}
