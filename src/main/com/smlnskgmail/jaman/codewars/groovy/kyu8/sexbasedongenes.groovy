package com.smlnskgmail.jaman.codewars.groovy.kyu8

/*
* https://www.codewars.com/kata/56530b444e831334c0000020
* */
class Gender {

    private String chromosomes

    Gender(String chromosomes) {
        this.chromosomes = chromosomes
    }

    String basedOnChromosomes() {
        return chromosomes.contains("Y")
                ? "Congratulations! You're going to have a son."
                : "Congratulations! You're going to have a daughter."
    }

}
