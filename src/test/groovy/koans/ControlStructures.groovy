package koans

import org.junit.Test

class ControlStructures {


    @Test
    void "if statement"() {

        def x = 1
        // ------------ START EDITING HERE ----------------------

        // ------------ STOP EDITING HERE  ----------------------
        assert x == 2, "use if statement to change the value"
    }

    @Test
    void "truth using if statement"() {

        // ------------ START EDITING HERE ----------------------
        if (false) assert true
        // ------------ STOP EDITING HERE  ----------------------
        else assert false

        // ------------ START EDITING HERE ----------------------
        if (0) assert true
        // ------------ STOP EDITING HERE  ----------------------
        else if (0) assert true
        else assert false

        // ------------ START EDITING HERE ----------------------
        if ('') assert true
        // ------------ STOP EDITING HERE  ----------------------
        else if ([]) assert true
        else {
            if (0) assert false
        }
    }

    @Test
    void "Elvis operator simplification"() {
        assert true ? true : false

        def x = getX(0)
        // ------------ START EDITING HERE ----------------------

        // ------------ STOP EDITING HERE  ----------------------
        assert x, "use elvis operator to simplify the method code (getX)"
    }

    def getX(def i) {
        if (i) {
            true
        } else false
    }

    @Test
    void "Elvis operator assignement"() {
        def y = true ? true : false
        assert y

        def x = 0
        // ------------ START EDITING HERE ----------------------

        // ------------ STOP EDITING HERE  ----------------------
        assert x, "use elvis operator to change the variable value using assignment"
    }

    @Test
    void "switch statement"() {
        switch (10) {
            case 0: assert false; break
            case 0..9: assert false; break
            case [8, 9, 11]: assert false; break
            case Float: assert false; break
            case { it % 3 == 0 }: assert false; break
            case ~/../: assert true; break
            default: assert false
        }



        def x = 1.23
        def result = ""

        switch (x) {
            case "foo": result = "found foo"
        // lets fall through
            case "bar": result += "bar"
            case [4, 5, 6, 'inList']: result = "list"; break
            case 12..30: result = "range"; break
            case Integer: result = "integer"; break
        // ------------ START EDITING HERE ----------------------

        // ------------ STOP EDITING HERE  ----------------------
            case ~/fo*/: /* toString() representation of x matches the pattern?*/
                result = "foo regex"; break
            case { it < 0 }: /* or { x < 0 }*/ result = "negative"; break
            default: result = "default"
        }
        assert result == "number"
    }

    @Test
    void "in operator"() {
        assert 1 in [1, 2, 3]

        // ------------ START EDITING HERE ----------------------
        def list = []
        // ------------ STOP EDITING HERE  ----------------------
        assert '7' in list
    }

    @Test
    void "while"() {
        def result = 0
        // ------------ START EDITING HERE ----------------------

        // ------------ STOP EDITING HERE  ----------------------
        assert result, "use while to increment the value of result"
    }

    @Test
    void "forloop"() {
        def result = 0
        // ------------ START EDITING HERE ----------------------

        // ------------ STOP EDITING HERE  ----------------------
        assert result, "use for to increment the value of result"
    }

    def "iterate over a range"() {
        def x = 0
        for (i in 0..9) {
            // ------------ START EDITING HERE ----------------------

            // ------------ STOP EDITING HERE  ----------------------
        }
        assert x == 45
    }

    def "iterate over a list"() {
        def x = 0
        for (i in [0, 1, 2, 3, 4]) {
            // ------------ START EDITING HERE ----------------------

            // ------------ STOP EDITING HERE  ----------------------
        }
        assert x == 10

    }

    def "iterate over an array"() {
        def array = (0..4).toArray()
        def x = 0
        for (i in array) {
            // ------------ START EDITING HERE ----------------------

            // ------------ STOP EDITING HERE  ----------------------
        }
        assert x == 10
    }

    def "iterate over a map"() {
        def map = ['abc': 1, 'def': 2, 'xyz': 3]
        def x = 0
        for (e in map) {
            // ------------ START EDITING HERE ----------------------

            // ------------ STOP EDITING HERE  ----------------------
        }
        assert x == 6
    }

    def "iterate over values in a map"() {
        def map = ['abc': 1, 'def': 2, 'xyz': 3]
        def x = 0
        for (v in map.values()) {
            // ------------ START EDITING HERE ----------------------

            // ------------ STOP EDITING HERE  ----------------------
        }
        assert x == 6
    }

    def "iterate over the characters in a string"() {

        def text = "abc"
        def list = []
        for (c in text) {
            // ------------ START EDITING HERE ----------------------

            // ------------ STOP EDITING HERE  ----------------------
        }
        assert list == ["a", "b", "c"]
    }

    @Test
    void "exception handling"() {
        try {
            // ------------ START EDITING HERE ----------------------
            'moo' // this will generate an exception
            // ------------ STOP EDITING HERE  ----------------------
            assert false     // asserting that this point should never be reached
        } catch (e) {
            assert e in NumberFormatException
        }
    }


}
