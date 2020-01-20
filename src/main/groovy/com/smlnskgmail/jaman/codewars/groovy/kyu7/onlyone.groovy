package com.smlnskgmail.jaman.codewars.groovy.kyu7

/*
 * https://www.codewars.com/kata/5734c38da41454b7f700106e
 * */
class OnlyOne {

	private input

	OnlyOne(boolean[] input) {
		this.input = input
	}

	boolean result() {
		input.count(true) == 1
	}
}
