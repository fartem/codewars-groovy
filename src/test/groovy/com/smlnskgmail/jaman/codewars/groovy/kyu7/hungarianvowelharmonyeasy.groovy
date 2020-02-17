package com.smlnskgmail.jaman.codewars.groovy.kyu7

class HungarianVowelsHarmonyTest extends GroovyTestCase {

    void testDative() {
        assertEquals(
                'ablaknak',
                new HungarianVowelsHarmony('ablak').dative()
        )
        assertEquals(
                'tükörnek',
                new HungarianVowelsHarmony('tükör').dative()
        )
        assertEquals(
                'keretnek',
                new HungarianVowelsHarmony('keret').dative()
        )
        assertEquals(
                'otthonnak',
                new HungarianVowelsHarmony('otthon').dative()
        )
        assertEquals(
                'virágnak',
                new HungarianVowelsHarmony('virág').dative()
        )
        assertEquals(
                'tettnek',
                new HungarianVowelsHarmony('tett').dative()
        )
        assertEquals(
                'rokkantnak',
                new HungarianVowelsHarmony('rokkant').dative()
        )
        assertEquals(
                'rossznak',
                new HungarianVowelsHarmony('rossz').dative()
        )
        assertEquals(
                'gonosznak',
                new HungarianVowelsHarmony('gonosz').dative()
        )
    }

}