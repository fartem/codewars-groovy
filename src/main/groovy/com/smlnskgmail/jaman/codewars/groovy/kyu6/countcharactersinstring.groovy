package com.smlnskgmail.jaman.codewars.groovy.kyu6

/*
 * https://www.codewars.com/kata/52efefcbcdf57161d4000091
 * */
class Characters {

	private String input

	Characters(input) {
		this.input = input
	}

	Map count() {
		input.iterator().countBy { it }
	}
}