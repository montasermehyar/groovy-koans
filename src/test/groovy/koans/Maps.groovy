package koans

import org.junit.Test

class Maps {

    @Test
    public void "Defining maps"() {

        def emptyMap = [:]
        def three = 3
        Map numbers = [one: 1, 'two': 2, (three): 3]
        // ------------ START EDITING HERE ----------------------

        // ------------ STOP EDITING HERE  ----------------------
        assert rhymeWords.size() == 3, 'Define a map with three rhymeWords'
        assert rhymeWords['empty'] == 'spaghetti'

    }

    @Test
    public void "Getting/setting map values with get/put"() {

        Map numbers = [1: 'one']
        numbers.put(2, 'two')
        // ------------ START EDITING HERE ----------------------

        // ------------ STOP EDITING HERE  ----------------------
        assert numbers.get(3) == 'three'

    }

    @Test
    public void "Getting/setting map values with bracket or dot notation"() {
        Map numbers = [one: 1]

        numbers['two'] = 2
        numbers.three = 3
        // ------------ START EDITING HERE ----------------------

        // ------------ STOP EDITING HERE  ----------------------
        assert numbers['four'] == 4
        assert numbers.five == 5

    }

    @Test
    void "putAll"() {
        def myMap = [a: 1, b: 2, c: 3]
        def explicitMap = new TreeMap()
        // ------------ START EDITING HERE ----------------------

        // ------------ STOP EDITING HERE  ----------------------
        assert explicitMap['a'] == 1
    }

    @Test
    void "spread operator"() {

        def myMap = [a: 1, b: 2, c: 3]
        assert [x: 7, *: myMap] == [x: 7, a: 1, b: 2, c: 3]

        // ------------ START EDITING HERE ----------------------
        def composed
        // ------------ STOP EDITING HERE  ----------------------
        assert composed == [x: 'y', a: 1, b: 2, c: 3]

    }

    @Test
    void "keys as variables values"() {
        def x = 'a'
        assert ['x': 1] == [x: 1]
        assert ['a': 1] == [(x): 1]

        def map
        // ------------ START EDITING HERE ----------------------

        // ------------ STOP EDITING HERE  ----------------------
        assert map == ['a': 7, 'x': 8]
    }

    @Test
    void "retrieve values"() {
        def myMap = [a: 1, b: 2, c: 3]
        assert myMap['a'] == 1
        // ------------ START EDITING HERE ----------------------
        def i
        // ------------ STOP EDITING HERE  ----------------------
        assert i == 3

        assert myMap.a == 1
        // ------------ START EDITING HERE ----------------------
        def a
        // ------------ STOP EDITING HERE  ----------------------
        assert a == 2


        assert myMap.get('a') == 1
        // ------------ START EDITING HERE ----------------------
        def get
        // ------------ STOP EDITING HERE  ----------------------
        assert get == 1


        assert myMap.get('a', 0) == 1
        // ------------ START EDITING HERE ----------------------
        def getWithDefaultValue
        // ------------ STOP EDITING HERE  ----------------------
        assert getWithDefaultValue == 78

    }

    @Test
    void "retrieve missing elements/default values"() {
        def myMap = [a: 1, b: 2, c: 3]
        assert myMap['d'] == null
        assert myMap.d == null
        assert myMap.get('d') == null
        assert myMap.get('d', 0) == 0
        assert myMap.d == 0
        // ------------ START EDITING HERE ----------------------

        // ------------ STOP EDITING HERE  ----------------------
        assert myMap.x == 0
    }

    @Test
    void "put items"() {
        def myMap = [a: 1, b: 2, c: 3]
        myMap['d'] = 1
        // ------------ START EDITING HERE ----------------------

        // ------------ STOP EDITING HERE  ----------------------
        assert myMap.z == 2

        myMap.d = 2
        assert myMap.d == 2
        // ------------ START EDITING HERE ----------------------

        // ------------ STOP EDITING HERE  ----------------------
        assert myMap.z == 8
    }

    @Test
    void "calling on keys that has special chars"() {
        def aMap = [b: "hi"]
        def myMap = ['a.b': 1, a: aMap]

        assert myMap.a.b == "hi"
        assert myMap.'a.b' == 1
        // ------------ START EDITING HERE ----------------------

        // ------------ STOP EDITING HERE  ----------------------
        assert myMap.'www.progressoft.com' == 1
    }

    @Test
    void "calling to equals"() {
        def myMap = [a: 1, b: 2, c: 3]
        def other = [b: 2, c: 3, a: 1]
        assert myMap == other
        // ------------ START EDITING HERE ----------------------

        // ------------ STOP EDITING HERE  ----------------------
        assert myMap != other
    }

    @Test
    void "isEmpty"() {
        // ------------ START EDITING HERE ----------------------

        // ------------ STOP EDITING HERE  ----------------------
        assert !myMap.isEmpty()
    }

    @Test
    void "size"() {
        // ------------ START EDITING HERE ----------------------

        // ------------ STOP EDITING HERE  ----------------------
        assert myMap.size() == 3
    }

    @Test
    void "containsKey"() {
        // ------------ START EDITING HERE ----------------------

        // ------------ STOP EDITING HERE  ----------------------
        assert myMap.containsKey('a')
    }

    @Test
    void "containsValue"() {
        // ------------ START EDITING HERE ----------------------

        // ------------ STOP EDITING HERE  ----------------------
        assert myMap.containsValue('a')
    }

    @Test
    void "any"() {
        def myMap = [a: 1, b: 2, c: 3]
        // ------------ START EDITING HERE ----------------------
        def any
        // ------------ STOP EDITING HERE  ----------------------
        assert !any
    }

    @Test
    void "every"() {
        def myMap = [a: 1, b: 2, c: 3]
        // ------------ START EDITING HERE ----------------------
        def every
        // ------------ STOP EDITING HERE  ----------------------
        assert every
    }

    @Test
    void "keySet"() {
        // ------------ START EDITING HERE ----------------------

        // ------------ STOP EDITING HERE  ----------------------
        assert myMap.keySet() == ['a', 'b', 'c'] as Set
    }

    @Test
    void "values"() {
        // ------------ START EDITING HERE ----------------------

        // ------------ STOP EDITING HERE  ----------------------
        myMap.values().toList() == [1, 2, 3]
    }

    @Test
    void "iterate over a map using entry"() {
        def myMap = [a: 1, b: 2, c: 3]
        def store = ''
        myMap.each { entry ->
            // ------------ START EDITING HERE ----------------------

            // ------------ STOP EDITING HERE  ----------------------
        }
        assert store == 'a1b2c3'
    }

    @Test
    void "iterate over a map using key and value"() {
        def myMap = [a: 1, b: 2, c: 3]
        def store = ''
        myMap.each { key, value ->
            // ------------ START EDITING HERE ----------------------

            // ------------ STOP EDITING HERE  ----------------------
        }
        assert store == 'a1b2c3'
    }

    @Test
    void "iterate over the keys only"() {
        def myMap = [a: 1, b: 2, c: 3]
        def store = ''
        // ------------ START EDITING HERE ----------------------
        def keySet
        // ------------ STOP EDITING HERE  ----------------------
        for (key in keySet) {
            store += key
        }
        assert store == 'abc'
    }

    @Test
    void "iterate over the values only"() {
        def myMap = [a: 1, b: 2, c: 3]
        def store = ''
        // ------------ START EDITING HERE ----------------------
        def values
        // ------------ STOP EDITING HERE  ----------------------
        for (value in values) {
            store += value
        }
        assert store == '123'
    }

    @Test
    void "clear"() {
        def myMap = [a: 1, b: 2, c: 3]
        // ------------ START EDITING HERE ----------------------

        // ------------ STOP EDITING HERE  ----------------------
        assert myMap.isEmpty()
    }

    @Test
    void "remove"() {
        def myMap = [a: 1, b: 2, c: 3]
        // ------------ START EDITING HERE ----------------------

        // ------------ STOP EDITING HERE  ----------------------
        assert myMap.size() == 2
    }

    @Test
    void "add maps"() {
        assert [a: 1] + [b: 2] == [a: 1, b: 2]

        def myMap = [a: 1, b: 2, c: 3]
        // ------------ START EDITING HERE ----------------------

        // ------------ STOP EDITING HERE  ----------------------
        assert myMap == [a: 1, b: 2, c: 3, r: 8, one: 9]
    }

    @Test
    void "sub maps"() {
        def myMap = [a: 1, b: 2, c: 3]
        def abMap = myMap.subMap(['a', 'b'])
        assert abMap.size() == 2

        def wakeUpAlarms = [
                SUN: 8,
                MON: 7,
                TUE: 8,
                WED: 7,
                THU: 8
        ]

        // ------------ START EDITING HERE ----------------------
        def result
        // ------------ STOP EDITING HERE  ----------------------
        assert result == [MON: 7, WED: 7, SUN: 8]
    }

    @Test
    void "findAll"() {
        def myMap = [a: 1, b: 2, c: 3]
        // ------------ START EDITING HERE ----------------------
        def abMap
        // ------------ STOP EDITING HERE  ----------------------
        assert abMap.size() == 2
        assert abMap.a == 1
    }

    @Test
    void "find"() {
        def myMap = [a: 1, b: 2, c: 3]
        // ------------ START EDITING HERE ----------------------
        def found
        // ------------ STOP EDITING HERE  ----------------------
        assert found.key == 'a'
        assert found.value == 1
    }

    @Test
    void "collect"() {
        def myMap = [a: 1, b: 2, c: 3]
        // ------------ START EDITING HERE ----------------------
        def doubled
        // ------------ STOP EDITING HERE  ----------------------
        assert doubled instanceof List
        assert doubled.every { item -> item % 2 == 0 }
    }

    @Test
    void "collect in pre defined list"() {
        def myMap = [a: 1, b: 2, c: 3]
        def addTo = []
        // ------------ START EDITING HERE ----------------------

        // ------------ STOP EDITING HERE  ----------------------
        assert addTo instanceof List
        assert addTo.every { item -> item % 2 == 0 }
    }

    @Test
    void "decline vars and args"() {
        def people = [peter: 40, paul: 30, mary: 20]
        assert people
                .findAll{ _, age -> age < 35 }
                .collect{ name, _ -> name.toUpperCase() }
                .sort()
                .join(', ') == 'MARY, PAUL'
    }

    @Test
    void "count words"() {
        def textCorpus =
                """
Look for the bare necessities
The simple bare necessities
Forget about your worries and your strife
I mean the bare necessities
Old Mother Nature's recipes
That bring the bare necessities of life
"""
        def words = textCorpus.tokenize()
        def wordFrequency = [:]
        words.each { word ->
            wordFrequency[word] = wordFrequency.get(word, 0) + 1
        }

        def sorted = wordFrequency.sort { e1, e2 ->
            e2.value <=> e1.value
        }

        assert sorted.take(1).bare == 4

    }
}