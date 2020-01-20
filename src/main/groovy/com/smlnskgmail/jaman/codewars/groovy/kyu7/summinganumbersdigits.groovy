package com.smlnskgmail.jaman.codewars.groovy.kyu7
/*
 * https://www.codewars.com/kata/52f3149496de55aded000410
 * */
class NumbersSum {

	private number

	NumbersSum(number) {
		this.number = number
	}

	Integer value() {
		Math.abs(number).toString().split('').sum { it -> Integer.valueOf(it) }
	}
}
