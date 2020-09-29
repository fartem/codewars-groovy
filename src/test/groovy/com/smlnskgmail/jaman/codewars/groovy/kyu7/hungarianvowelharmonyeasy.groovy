package com.smlnskgmail.jaman.codewars.groovy.kyu7

class HungarianVowelsHarmonyTest extends GroovyTestCase {

    void testDative() {
        assertEquals(
                'ablaknak',
                new HungarianVowelsHarmonyEasy('ablak').solution()
        )
        assertEquals(
                'tükörnek',
                new HungarianVowelsHarmonyEasy('tükör').solution()
        )
        assertEquals(
                'keretnek',
                new HungarianVowelsHarmonyEasy('keret').solution()
        )
        assertEquals(
                'otthonnak',
                new HungarianVowelsHarmonyEasy('otthon').solution()
        )
        assertEquals(
                'virágnak',
                new HungarianVowelsHarmonyEasy('virág').solution()
        )
        assertEquals(
                'tettnek',
                new HungarianVowelsHarmonyEasy('tett').solution()
        )
        assertEquals(
                'rokkantnak',
                new HungarianVowelsHarmonyEasy('rokkant').solution()
        )
        assertEquals(
                'rossznak',
                new HungarianVowelsHarmonyEasy('rossz').solution()
        )
        assertEquals(
                'gonosznak',
                new HungarianVowelsHarmonyEasy('gonosz').solution()
        )
    }

}
