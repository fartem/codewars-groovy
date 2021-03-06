package com.smlnskgmail.jaman.codewars.groovy.kyu7

import groovy.transform.TupleConstructor

// https://www.codewars.com/kata/57f759bb664021a30300007d
@TupleConstructor
class Switcheroo {

	String input

	String solution() {
		input.collectReplacements {
			switch (it) {
				case 'a':
					'b'
					break
				case 'b':
					'a'
					break
			}
		}
	}

}
