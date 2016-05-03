package ControlStatements.Example;

/**
 * Created by alex__000 on 02/05/2016.
 */
public class Person {
    private String firstName;
    private String lastName;

    //constructor
    public Person(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //getters and setters

    public void setFirstName(String fn) {
        this.firstName = fn;
    }

    public String getFirstName()
    {
        return this.firstName;
    }

    public void setLastName(String ln) {
        this.lastName = ln;
    }

    public String getLastName()
    {
        return this.lastName;
    }

}
