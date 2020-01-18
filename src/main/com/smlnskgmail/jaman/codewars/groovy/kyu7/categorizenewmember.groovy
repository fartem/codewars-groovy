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
        members.stream()
                .map({ it -> it[0] >= 55 && it[1] > 7 ? "Senior" : "Open" })
                .collect()
    }

}