package com.smlnskgmail.jaman.codewars.groovy.kyu7

import groovy.transform.TupleConstructor

// https://www.codewars.com/kata/5a84d485742ba347b90006b7
@TupleConstructor
class ListOfPresents {

    Integer maxBudget
    List gifts

    Integer solution() {
        if (!gifts || !maxBudget) {
            return 0
        }
        Integer count = 0
        gifts.sort()
        Iterator iterator = gifts.iterator()
        while (maxBudget >= 0 && iterator.hasNext()) {
            Integer price = iterator.next()
            if (maxBudget >= price) {
                maxBudget -= price
                count++
            } else {
                break
            }
        }
        return count
    }

}
