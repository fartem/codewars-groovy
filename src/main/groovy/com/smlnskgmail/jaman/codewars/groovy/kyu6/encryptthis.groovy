package com.smlnskgmail.jaman.codewars.groovy.kyu6

/*
 * https://www.codewars.com/kata/5848565e273af816fb000449
 * */
class Crypt {

	private String input

	Crypt(input) {
		this.input = input
	}

	String encrypt() {
		input.split(' ').collect {
			if (it) {
				def prefix = it.codePointAt(0)
				if (it.length() > 2) {
					"$prefix${it.charAt(it.length() - 1)}${it.substring(2, it.length() - 1)}${it.charAt(1)}"
				} else {
					"${prefix}${it.substring(1)}"
				}
			}
		}.join(' ')
	}
}