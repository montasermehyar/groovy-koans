package koans

import org.junit.Test

class Java {


    @Test
    public void "Java beans"() {
        JavaPerson dries = new JavaPerson()
        dries.firstName = 'Dries' //We implicitly call the setter
        // ------------ START EDITING HERE ----------------------

        // ------------ STOP EDITING HERE  ----------------------
        JavaPerson andre = new JavaPerson(firstName: 'Andre')
        // ------------ START EDITING HERE ----------------------

        // ------------ STOP EDITING HERE  ----------------------
        assert dries.lastName == 'Roelvink', "Set his last name in the same way as his first name"
        assert andre.lastName == 'Hazes', "Set his last name during construction"

    }

    @Test
    public void "Groovy beans"() {

        def dries = new GroovyPerson()
        dries.setFirstName('Dries') //Groovy makes a setter for us
        // ------------ START EDITING HERE ----------------------

        // ------------ STOP EDITING HERE  ----------------------
        assert dries.lastName == 'Roelvink'

    }

    @Test
    public void "Groovy beans 2"() {
        def dries = new GroovyPerson2(firstName: 'dries', lastName: 'roelvink')
        assert dries.lastName == 'Roelvink', "make a setter for lastName"
        assert dries.fullName == 'Dries Roelvink', "make a getter for fullName"

    }
}

public class GroovyPerson2 {
    String firstName
    String lastName

    void setFirstName(String value) {
        firstName = value.capitalize()
    }

    // ------------ START EDITING HERE ----------------------
    // add fullName getter here
    // ------------ STOP EDITING HERE  ----------------------
}

public class JavaPerson {
    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        println "Setting last name to $lastName"
        this.lastName = lastName;
    }
}


public class GroovyPerson {
    String firstName
    String lastName
}


