package com.smlnskgmail.jaman.codewars.groovy.kyu7

import groovy.transform.TupleConstructor

/*
 * https://www.codewars.com/kata/59f061773e532d0c87000d16
 */
@TupleConstructor
class ElevatorDistance {

	List floors

	Integer distance() {
		floors.collate(2, 1, false).sum { Math.abs(it[0] - it[1]) } as Integer
	}

}
