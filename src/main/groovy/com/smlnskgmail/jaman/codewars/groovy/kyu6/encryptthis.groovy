package com.smlnskgmail.jaman.codewars.groovy.kyu6

import groovy.transform.TupleConstructor

/*
 * https://www.codewars.com/kata/5848565e273af816fb000449
 */
@TupleConstructor
class Crypt {

	String input

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