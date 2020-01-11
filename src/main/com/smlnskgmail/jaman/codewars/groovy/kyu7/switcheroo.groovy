package com.smlnskgmail.jaman.codewars.groovy.kyu7

/*
* https://www.codewars.com/kata/57f759bb664021a30300007d
* */
class ABSwitch {

    private String input

    ABSwitch(String input) {
        this.input = input
    }

    String result() {
        return input.collectReplacements {
            switch (it) {
                case 'a':
                    'b'
                    break
                case 'b':
                    'a'
                    break
            }
        }
    }

}