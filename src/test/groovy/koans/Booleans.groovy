package koans

import org.junit.Test

class Booleans {

    @Test
    void "Comparing booleans"() {
        boolean predicate = true
        // ------------ START EDITING HERE ----------------------

        // ------------ STOP EDITING HERE  ----------------------
        assert predicate == false
    }

    @Test
    void "Collections as booleans"() {

        List list = []
        // ------------ START EDITING HERE ----------------------

        // ------------ STOP EDITING HERE  ----------------------
        assert list, "The list needs to be filled"

    }

    @Test
    void "String truth"() {

        String s1
        String s2 = ''
        // ------------ START EDITING HERE ----------------------

        // ------------ STOP EDITING HERE  ----------------------
        assert s1, "Null is not truthy"
        assert s2, "An empty string is not truthy"

    }

    @Test
    void "Numerical truth"() {

        int one = 1
        int negative = -1
        int zero = 0
        assert one, "positive integers are truthy"
        assert negative, "negative integers are truthy"
        // ------------ START EDITING HERE ----------------------
        assert zero, "0 Is not truthy"
        // ------------ STOP EDITING HERE  ----------------------


    }

    @Test
    void "truth"() {

        List truthy
        List falsy

        // ------------ START EDITING HERE ----------------------

        // ------------ STOP EDITING HERE  ----------------------

        //Don't worry. We'll explain how the code beneath works later.
        assert truthy.toSet().size() > 2, "Assign 3 different truthy values"
        truthy.each {
            assert it, "$it is not truthy"
        }
        assert falsy.toSet().size() > 2, "Assign 3 different falsy values"
        falsy.each {
            assert !it, "$it is not falsy"
        }
    }

}
