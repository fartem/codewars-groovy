package com.smlnskgmail.jaman.codewars.groovy.kyu7

/*
* https://www.codewars.com/kata/5502c9e7b3216ec63c0001aa
* */
class Club {

    private members

    Club(members) {
        this.members = members
    }

    List categorized() {
        members.collect { age, handicap -> age >= 55 && handicap > 7 ? 'Senior' : 'Open' }
    }

}