package com.smlnskgmail.jaman.codewars.groovy.kyu5

/*
 * https://www.codewars.com/kata/52f787eb172a8b4ae1000a34
 * */
class TrailingZeros {

	private number

	TrailingZeros(number) {
		this.number = number
	}

	Integer zerosCount() {
		Integer result = 0
		for (int i = 5; number / i >= 1; i *= 5) {
			result += number / i
		}
		result
	}
}