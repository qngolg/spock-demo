package com.qngolg.spock

import spock.lang.Specification

class SetUpDemo extends Specification{

    def setUpDiffGiven

    void setup() {
        setUpDiffGiven = "set up"
        println '我是set up'
    }

    void setupSpec() {
        println 'I am set up Spec'
    }

    void cleanupSpec() {
        println "I am clean up spec"
    }

    void cleanup() {
        println "I am clean up"
    }

    def "should show set up"() {
        given:
        println "I am given"
        when:
        println "I am when"
        then:
        println "I am then"
    }

    def "should show set up spec2"() {
        given:
        println "I am given2"
        when:
        println "I am when2"
        then:
        println "I am then2"
    }

    def "should different given and set up"() {
        given:
        setUpDiffGiven = 'given'
        expect:
        println setUpDiffGiven
    }
}
