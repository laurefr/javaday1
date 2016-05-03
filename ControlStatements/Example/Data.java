package ControlStatements.Example;

/**
 * Created by alex__000 on 02/05/2016.
 */
import java.util.ArrayList;
import java.util.List;

public class Data {

    public static List<Person> GetPeople() {
        final List<Person> peopleList = new ArrayList<>();

        peopleList.add(new Person("Alex", "Kennedy"));
        peopleList.add(new Person("David", "Beckham"));

        return peopleList;
    }
}
