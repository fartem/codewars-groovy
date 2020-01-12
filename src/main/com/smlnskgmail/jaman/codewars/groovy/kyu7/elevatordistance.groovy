package com.smlnskgmail.jaman.codewars.groovy.kyu7

/*
* https://www.codewars.com/kata/59f061773e532d0c87000d16
* */
class ElevatorDistance {

    private List<Integer> floors

    ElevatorDistance(List<Integer> floors) {
        this.floors = floors
    }

    Integer distance() {
        return (0..<floors.size()).collect {
            return it != 0 ? Math.abs(floors[it - 1] - floors[it]) : 0
        }.sum() as Integer
    }

}