package koans

import groovy.transform.Canonical
import org.junit.Test

@Newify(Employee.class)
class ListMethods {
    @Test
    void "flatten"() {
        def list = [1, 2, [2, 3]]
        // ------------ START EDITING HERE ----------------------
        def result
        // ------------ STOP EDITING HERE  ----------------------
        assert list.flatten() == result
    }

    @Test
    void "intersect"() {
        def integers = [1, 2, 3]
        // ------------ START EDITING HERE ----------------------
        def result
        // ------------ STOP EDITING HERE  ----------------------
        assert integers.intersect([4, 3, 1]) == result
    }

    @Test
    void "disjoint"() {
        assert [1, 2, 3].disjoint([4, 5, 6])

        // ------------ START EDITING HERE ----------------------
        def list
        // ------------ STOP EDITING HERE  ----------------------
        assert list.disjoint([2, 3, 4])
    }

    @Test
    void "Treating a list like a stack"() {
        def list = [1, 2, 3]
        def popped = list.pop()
        assert popped == 3
        assert list == [1, 2]

        // ------------ START EDITING HERE ----------------------

        // ------------ STOP EDITING HERE  ----------------------
        assert popped == 2
        assert list == [1]
    }

    @Test
    void "reverse"() {
        assert [1, 2].reverse() == [2, 1]


        def original = (0..100).toList()
        // ------------ START EDITING HERE ----------------------

        // ------------ STOP EDITING HERE  ----------------------
        assert reversed == original[-1..0]
    }

    @Test
    void "sort"() {
        assert [3, 1, 2].sort() == [1, 2, 3]

        def letters = ['x', 'b', 'm', 'w']
        // ------------ START EDITING HERE ----------------------
        def sortedLetters
        // ------------ STOP EDITING HERE  ----------------------
        assert sortedLetters[-1] == 'x'
    }

    @Test
    void "sort using custom comparators"() {
        def list = [[1, 0], [0, 1, 2]]
        list = list.sort { a, b -> a[0] <=> b[0] }
        assert list == [[0, 1, 2], [1, 0]]

        def employees = [
                new Employee(age: 24, name: 'James'),
                new Employee(age: 35, name: 'Icard'),
                new Employee(age: 33, name: 'Ana'),
                new Employee(age: 28, name: 'Ada'),
                new Employee(age: 26, name: 'James'),
                new Employee(age: 51, name: 'Noah'),
                new Employee(age: 78, name: 'Gary')
        ]

        // ------------ START EDITING HERE ----------------------
        def sortedByAge
        // ------------ STOP EDITING HERE  ----------------------
        assert sortedByAge[-1].name == 'Gary'
    }

    @Test
    void "remove by index/value"() {
        def list = ['a', 'b', 'c']
        list.remove(2)
        assert list == ['a', 'b']
        list.remove('b')
        assert list == ['a']

        def xlist = ['if', 'you', 'never', 'try', 'you', 'will', 'never', 'know']
        // ------------ START EDITING HERE ----------------------

        // ------------ STOP EDITING HERE  ----------------------
        assert xlist.size() == 3
        assert xlist.contains('know')

        // ------------ START EDITING HERE ----------------------

        // ------------ STOP EDITING HERE  ----------------------
        assert !xlist.contains('know')
        assert xlist.size() == 2
    }

    @Test
    void "removeAll"() {
        def list = ['a', 'b', 'b', 'c']
        list.removeAll(['b', 'c'])
        assert list == ['a']

        def integers = [1, 2, 3]
        // ------------ START EDITING HERE ----------------------

        // ------------ STOP EDITING HERE  ----------------------
        assert integers == [2]
    }

    @Test
    void "collect"() {
        def integers = [1, 2, 3]
        integers.collect { println "it = $it" }

        // ------------ START EDITING HERE ----------------------
        def doubled
        // ------------ STOP EDITING HERE  ----------------------
        assert doubled == [2, 4, 6]
    }

    @Test
    void "findAll"() {
        def odd = [1, 2, 3].findAll { item ->
            item % 2 == 1
        }
        assert odd == [1, 3]

        def from0To10 = (0..10).toList()
        // ------------ START EDITING HERE ----------------------
        def result
        // ------------ STOP EDITING HERE  ----------------------
        assert result == [1, 2, 4, 8]
    }

    @Test
    void "unique"() {
        def x = [1, 1, 1]
        assert [1] == new HashSet(x).toList()
        assert [1] == x.unique()

        def binaries = [0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0
                        , 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1]
        // ------------ START EDITING HERE ----------------------
        def result
        // ------------ STOP EDITING HERE  ----------------------
        assert result == [0, 1]

    }

    @Test
    void "grep"() {
        def x = [1, null, 1]
        assert [1, 1] == x.findAll { it != null }
        assert [1, 1] == x.grep { it }

        def shootingStar = ['Its late and Im awake, staring at the wall',
                            'Open up my window, head floats out the door',
                            'No one else around, the shimmer takes my eye',
                            'I lift my head, blinded by the sky']

        // ------------ START EDITING HERE ----------------------
        def linesThatContainsMy
        // ------------ STOP EDITING HERE  ----------------------
        assert !linesThatContainsMy.contains('Its late and Im awake, staring at the wall')
    }

    @Test
    void 'first'() {
        def list = [1, 2, 3]
        assert list.first() == 1

        // ------------ START EDITING HERE ----------------------

        // ------------ STOP EDITING HERE  ----------------------
        assert list.first() == 2
    }

    @Test
    void 'head'() {
        def list = [1, 2, 3]
        assert list.head() == 1

        // ------------ START EDITING HERE ----------------------

        // ------------ STOP EDITING HERE  ----------------------
        assert list.head() == 2
    }

    @Test
    void 'tail'() {
        def list = [1, 2, 3]
        assert list.tail() == [2, 3]
        // ------------ START EDITING HERE ----------------------
        def result
        // ------------ STOP EDITING HERE  ----------------------
        assert list == [1, 2, 3]
        assert result == [3]
    }

    @Test
    void 'last'() {
        def list = [1, 2, 3]
        assert list.last() == 3

        // ------------ START EDITING HERE ----------------------

        // ------------ STOP EDITING HERE  ----------------------
        assert list.last() == 9
    }

    @Test
    void 'count'() {
        def list = [1, 2, 3]
        assert list.count(2) == 1
        // ------------ START EDITING HERE ----------------------
        def result
        // ------------ STOP EDITING HERE  ----------------------
        assert !result
    }

    @Test
    void 'max/min'() {
        def list = [1, 2, 3]
        assert list.max() == 3
        assert list.min() == 1

        def letters = ['a', 'v', 'm', 'w']
        // ------------ START EDITING HERE ----------------------

        // ------------ STOP EDITING HERE  ----------------------
        assert max == 'w'
        assert min == 'a'
    }

    @Test
    void 'find'() {
        def list = [1, 2, 3]
        def even = list.find { item ->
            item % 2 == 0
        }
        assert even == 2

        // ------------ START EDITING HERE ----------------------
        def odd
        // ------------ STOP EDITING HERE  ----------------------
        assert odd == [1, 3]

    }

    @Test
    void 'every'() {
        def list = [1, 2, 3]

        assert list.every { item -> item < 5 }

        // ------------ START EDITING HERE ----------------------
        def result
        // ------------ STOP EDITING HERE  ----------------------
        assert result == false
    }

    @Test
    void 'any'() {
        def list = [1, 2, 3]

        assert list.any { item -> item < 2 }

        // ------------ START EDITING HERE ----------------------
        def result
        // ------------ STOP EDITING HERE  ----------------------
        assert result == false
    }

    @Test
    void 'each'() {
        def list = [1, 2, 3]
        def store = ''
        list.each { item ->
            // ------------ START EDITING HERE ----------------------

            // ------------ STOP EDITING HERE  ----------------------
        }
        assert store == '123'

    }

    @Test
    void 'reveseEach'() {
        def list = [1, 2, 3]
        def store = ''
        list.reverseEach { item ->
            // ------------ START EDITING HERE ----------------------

            // ------------ STOP EDITING HERE  ----------------------
        }
        assert store == '321'
    }

    @Test
    void 'eachWithIndex'() {
        def list = [1, 2, 3]
        def store = ''
        list.eachWithIndex { item, index ->
            // ------------ START EDITING HERE ----------------------

            // ------------ STOP EDITING HERE  ----------------------
        }
        assert store == '0:1 1:2 2:3 '
    }

    @Test
    void 'join'() {
        def list = [1, 2, 3]
        assert list.join('-') == '1-2-3'
        // ------------ START EDITING HERE ----------------------
        def csv
        // ------------ STOP EDITING HERE  ----------------------
        assert csv == '1,2,3'
    }

    @Test
    void 'inject'() {
        def list = [1, 2, 3]
        def result = list.inject(0) { clinks, guests ->
            clinks + guests
        }
        assert result == 0 + 1 + 2 + 3 // list.sum()

        // ------------ START EDITING HERE ----------------------

        // ------------ STOP EDITING HERE  ----------------------
        assert result == 2 * 1 * 2 * 3
    }

    @Test
    void "take"() {
        def list = [1, 2, 3]
        assert list.take(2) == list[0..1]
    }


    @Test
    void "takeWhile"() {
        def list = [1, 2, 3]
        assert list.takeWhile { it < 3 } == list[0..1]

        def letters = ('a'..'z')
        // ------------ START EDITING HERE ----------------------
        def partion
        // ------------ STOP EDITING HERE  ----------------------
        assert partion == ('a'..'l')
    }

    @Test
    void "transpose"() {
        // ------------ START EDITING HERE ----------------------
        def list
        // ------------ STOP EDITING HERE  ----------------------
        def transpose = list.transpose()
        assert transpose == [[1, 1], [2, 2], [3, 3]]
    }

    @Test
    void "groupBy"() {
        def result = [1, 2, 3, 4, 5, 6].groupBy([{ it % 2 }, { it < 4 }])
        assert result == [1: [(true): [1, 3], (false): [5]], 0: [(true): [2], (false): [4, 6]]]

        def employees = [Employee("Ahmad", 24), Employee("khaled", 78), Employee("salem", 99)]
        // ------------ START EDITING HERE ----------------------
        def threeFactor
        // ------------ STOP EDITING HERE  ----------------------
        assert threeFactor == [0: employees[0..1], 1: [employees[2]]]
    }

    @Test
    void "collate"() {
        def list = [1, 2, 3]
        // ------------ START EDITING HERE ----------------------
        def sublists
        // ------------ STOP EDITING HERE  ----------------------
        assert sublists.size() == 2
        assert sublists[0] == [1, 2]
    }

    @Test
    void "permutations"() {
        def list = [1, 2, 3]
        def permutations = list.permutations()
        assert permutations == [[3, 2, 1], [3, 1, 2], [1, 3, 2], [2, 3, 1], [2, 1, 3], [1, 2, 3]] as Set

        // ------------ START EDITING HERE ----------------------
        def letters
        // ------------ STOP EDITING HERE  ----------------------
        assert letters.permutations() == [['z', 'w', 'a'], ['a', 'w', 'z'], ['a', 'z', 'w'], ['z', 'a', 'w'], ['w', 'a', 'z'], ['w', 'z', 'a']] as Set

    }

    @Test
    void "combinations"() {
        // ------------ START EDITING HERE ----------------------
        def lists
        // ------------ STOP EDITING HERE  ----------------------
        def combinations = lists.combinations()
        assert combinations == [['a', 1], ['b', 1], ['a', 2], ['b', 2], ['a', 3], ['b', 3]]
    }

    class HorseIterable implements Iterable<String> {
        Iterator<String> iterator() { "horse".iterator() }
    }

    @Test
    void "dropWhile"() {
        def horse = new HorseIterable()
        assert horse.dropWhile { it < 'r' } == ['r', 's', 'e']
        assert horse.dropWhile { it <= 'r' } == ['s', 'e']

        def nums = [1, 2, 3] as SortedSet

        // ------------ START EDITING HERE ----------------------
        def dropWhile
        // ------------ STOP EDITING HERE  ----------------------
        assert dropWhile == [] as SortedSet

        // ------------ START EDITING HERE ----------------------
        def dropWhile1
        // ------------ STOP EDITING HERE  ----------------------
        assert dropWhile1 == [2, 3] as SortedSet

        // ------------ START EDITING HERE ----------------------
        def dropWhile2
        // ------------ STOP EDITING HERE  ----------------------
        assert dropWhile2 == [3] as SortedSet

        // ------------ START EDITING HERE ----------------------
        def dropWhile3
        // ------------ STOP EDITING HERE  ----------------------
        assert dropWhile3 == [1, 2, 3] as SortedSet

    }

    @Test
    void "collectMany"() {
        def nums = 1..10
        // ------------ START EDITING HERE ----------------------
        def squaresAndCubesOfEvens
        // ------------ STOP EDITING HERE  ----------------------
        assert squaresAndCubesOfEvens == [4, 8, 16, 64, 36, 216, 64, 512, 100, 1000]
    }

    def quickSort(list) {
        if (list.size() < 2) return list
        def pivot = list[list.size().intdiv(2)]
        def left = list.findAll { item -> item < pivot }
        def middle = list.findAll { item -> item == pivot }
        // ------------ START EDITING HERE ----------------------
        def right
        // ------------ STOP EDITING HERE  ----------------------
        return quickSort(left) + middle + quickSort(right)
    }

    @Test
    void 'list example'() {
        def list = [7, 1, 2, 3, 8, 6]
        assert quickSort(list)[-1] == 8
        assert quickSort([]) == []
        assert quickSort([1]) == [1]
        assert quickSort([1, 2]) == [1, 2]
        assert quickSort([2, 1]) == [1, 2]
        assert quickSort([3, 1, 2]) == [1, 2, 3]
        assert quickSort([3, 1, 2, 2]) == [1, 2, 2, 3]
        assert quickSort([1.0f, 'a', 10, null]) == [null, 1.0f, 10, 'a']
        assert quickSort('bca') == 'abc'.toList()
    }
}

@Canonical
class Employee {
    String name
    Integer age
}