package com.smlnskgmail.jaman.codewars.groovy.kyu7

import groovy.transform.TupleConstructor

// https://www.codewars.com/kata/5502c9e7b3216ec63c0001aa
@TupleConstructor
class CategorizeNewMember {

	List members

	List solution() {
		members.collect { age, handicap -> age >= 55 && handicap > 7 ? 'Senior' : 'Open' }
	}

}
