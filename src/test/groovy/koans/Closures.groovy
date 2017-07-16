package koans

import groovy.transform.ToString
import org.junit.Test

class Closures {
    @Test
    public void "Closures "() {

        Closure hello = { String name -> println "Hello $name" }
        hello('Frans')
        Closure times = { i1, i2 -> i1 * i2 }
        // ------------ START EDITING HERE ----------------------

        // ------------ STOP EDITING HERE  ----------------------
        assert plusOne(1) == 2
        assert plus(1, 2) == 3

    }

    @Test
    public void "Closures.call()"() {

        // ------------ START EDITING HERE ----------------------
        def plusOne
        // ------------ STOP EDITING HERE  ----------------------
        assert plusOne(1) == 2
        assert plusOne.call(5) == 6

    }

    @Test
    public void "Closure without arguments"() {
        // ------------ START EDITING HERE ----------------------
        def noArg = { 'Closure without arguments.' }
        // ------------ STOP EDITING HERE  ----------------------
        assert noArg() == 'Sieneke'

    }

    @Test
    public void "it parameter in closures"() {
        Closure hello = { println "Hello $it" }
        hello('Dries')
        // ------------ START EDITING HERE ----------------------
        Closure plusOne = { 5 }
        // ------------ STOP EDITING HERE  ----------------------
        assert plusOne(1) == 2
        assert plusOne('Marco') == 'Marco1'

    }

    def runThreeTimes(Closure closure) {
        // ------------ START EDITING HERE ----------------------

        // ------------ STOP EDITING HERE  ----------------------
    }

    @Test
    public void "Closure as method parameter"() {
        runThreeTimes { println 'shalalalie' }
    }

    def times(int amount, Closure closure) {
        // ------------ START EDITING HERE ----------------------

        // ------------ STOP EDITING HERE  ----------------------
    }


    @Test
    public void "Closure as last method parameter"() {
        times(2) { println 'shalalala' }
        times 2, { println 'shalalalie' }
        times(1, { println 'shalalalie' })
    }

    @Test
    public void "Bound parameters"() {
        // ------------ START EDITING HERE ----------------------

        // ------------ STOP EDITING HERE  ----------------------
        int runAmount = 0
        Closure run = { runAmount++ }
        threeTimes(run)
        assert runAmount == 3

    }

    @Test
    public void "Default parameters"() {

        def greet = { greeting, name -> "${greeting} ${name}" }
        // ------------ START EDITING HERE ----------------------

        // ------------ STOP EDITING HERE  ----------------------
        assert greet('Roy') == 'hello Roy'

    }

    @Test
    void "trampoline"() {
        def removeUntilListIsEmpty

        // ------------ START EDITING HERE ----------------------
        removeUntilListIsEmpty = { list, counter = 0 ->
            if (list.size() == 0) {
                counter
            } else {
                removeUntilListIsEmpty(list.tail(), counter + 1)
            }
        }
        // ------------ STOP EDITING HERE  ----------------------
        assert removeUntilListIsEmpty(1..10000) == 10000
    }

    @Test
    void "memoize"() {
        def fib
        fib = { it < 2 ? 1 : fib(it - 1) + fib(it - 2) }
        // ------------ START EDITING HERE ----------------------

        // ------------ STOP EDITING HERE  ----------------------
        def start = System.currentTimeMillis()
        assert fib(40) == 165_580_141
        assert System.currentTimeMillis() - start < 150
    }

    @Test
    void "isCase"() {
        def odd = { it % 2 }

        switch (11) {
            case odd: print "this is odd number"
        }

        if (11 in odd) "this is odd number too"

        // ------------ START EDITING HERE ----------------------
        def even
        // ------------ STOP EDITING HERE  ----------------------
        switch (10) {
            case !even: assert true
            default: assert false
        }

        if (10 in even) assert true
        else assert false
    }

    @ToString
    class Person {
        String name
    }

    class PersonRepository {

        def save(Person person) {
            "$person saved"
        }

        def delete(Person person) {
            "$person deleted"
        }

    }

    @Test
    void "delegation"() {
        def p = new Person(name: 'Igor')
        def cl = { name.toUpperCase() }
        cl.delegate = p
        assert cl() == 'IGOR'

        PersonRepository repository = new PersonRepository()
        def save = { Person person -> save(person) }
        def delete = { Person person -> delete(person) }
        // ------------ START EDITING HERE ----------------------

        // ------------ STOP EDITING HERE  ----------------------
        assert save(p) == 'koans.Closures$Person(Igor) saved'
        assert delete(p) == 'koans.Closures$Person(Igor) deleted'
    }
}















