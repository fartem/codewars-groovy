package com.smlnskgmail.jaman.codewars.groovy.kyu8

/*
 * https://www.codewars.com/kata/56530b444e831334c0000020
 * */
class Gender {

	private chromosomes

	Gender(chromosomes) {
		this.chromosomes = chromosomes
	}

	String basedOnChromosomes() {
		return "Congratulations! You're going to have a ${chromosomes.contains('Y') ? 'son' : 'daughter'}."
	}
}
