package com.smlnskgmail.jaman.codewars.groovy.kyu8

/*
* https://www.codewars.com/kata/55cb854deb36f11f130000e1
* */
class Grasshopper {

    static weatherInfo(temp) {
        Integer c = convertToCelsius(temp)
        "$c ${c > 0 ? 'is above freezing temperature' : 'is freezing temperature'}"
    }

    static convertToCelsius(temperature) {
        (temperature - 32) * (5 / 9)
    }

}