package com.smlnskgmail.jaman.codewars.groovy.kyu6

/*
 * https://www.codewars.com/kata/5583d268479559400d000064
 * */
class Text {

	private input

	Text(input) {
		this.input = input
	}

	String fromBinary() {
		input.toList()
				.collate(8)
				.stream()
				.map({ v -> (char) Integer.parseInt(v.join(''), 2) })
				.collect()
				.join('')
	}
}
