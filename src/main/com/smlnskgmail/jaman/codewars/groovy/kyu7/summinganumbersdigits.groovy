package com.smlnskgmail.jaman.codewars.groovy.kyu7


import java.util.function.IntUnaryOperator

/*
* https://www.codewars.com/kata/52f3149496de55aded000410
* */
class NumbersSum {

    private Integer number

    NumbersSum(Integer number) {
        this.number = number
    }

    Integer value() {
        return String.valueOf(number)
                .chars()
                .map(new IntUnaryOperator() {
                    @Override
                    int applyAsInt(int operand) {
                        return Character.isDigit(operand)
                                ? Character.digit(operand, 10)
                                : 0
                    }
                })
                .sum()
    }

}