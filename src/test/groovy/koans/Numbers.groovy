package koans

import org.junit.Test

class Numbers {

    @Test
    void "repetition"() {
        def store = ''
        // ------------ START EDITING HERE ----------------------
        def i
        // ------------ STOP EDITING HERE  ----------------------
        i.times {
            store += 'x'
        }
        assert store == 'xxx'
    }

    @Test
    void "upTo"() {
        def store = ''

        // ------------ START EDITING HERE ----------------------
        def i
        // ------------ STOP EDITING HERE  ----------------------

        i.upto(5) { number ->
            store += number
        }
        assert store == '12345'
    }

    @Test
    void "downTo"() {
        def store = ''
        // ------------ START EDITING HERE ----------------------
        def i
        // ------------ STOP EDITING HERE  ----------------------
        2.downto(i) { number ->
            store += number + ' '
        }
        assert store == '2 1 0 -1 -2 '
    }

    @Test
    void "step"() {
        def store = ''
        // ------------ START EDITING HERE ----------------------
        def stepLength
        // ------------ STOP EDITING HERE  ----------------------
        0.step(0.5, stepLength) { number ->
            store += number + ' '
        }
        assert store == '0 0.1 0.2 0.3 0.4 '
    }

    @Test
    void "conversion"() {
        assert 2 == 2.5.toInteger() // conversion
        assert 2 == 2.5 as Integer // enforced coercion
        assert 2 == (int) 2.5 // cast
        assert 5 == '5'.toInteger()
        assert 5 == '5' as Integer
        assert 53 == (int) '5'

    }

    @Test
    void "numeric methods"() {
        assert 1 == (-1).abs()
        assert 3 == 2.5f.round()
        assert 3.142 == Math.PI.round(3)
        assert 4 == 4.5f.trunc()
        assert 2.718 == Math.E.trunc(3)
        assert '2.718'.isNumber()
    }

}