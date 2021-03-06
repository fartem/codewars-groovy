package com.smlnskgmail.jaman.codewars.groovy.kyu8

import groovy.transform.TupleConstructor

// https://www.codewars.com/kata/56530b444e831334c0000020
@TupleConstructor
class DetermineOffspringSexBasedOnGenesXXAndXYChromosomes {

	String chromosomes

	String solution() {
		return "Congratulations! You're going to have a ${chromosomes.contains('Y') ? 'son' : 'daughter'}."
	}

}
