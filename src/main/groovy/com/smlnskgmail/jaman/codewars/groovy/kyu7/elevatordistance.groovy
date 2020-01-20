package com.smlnskgmail.jaman.codewars.groovy.kyu7

/*
 * https://www.codewars.com/kata/59f061773e532d0c87000d16
 * */
class ElevatorDistance {

	private floors

	ElevatorDistance(floors) {
		this.floors = floors
	}

	Integer distance() {
		floors.collate(2, 1, false).sum { Math.abs(it[0] - it[1]) }
	}
}
