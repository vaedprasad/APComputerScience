import java.util.*;
/**
 * Write a description of class Person here.
 * 
 * @author Vaed Prasad
 */
public class Person implements Comparable<Person> {
    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int compareTo(Person anotherPerson){     
        if(lastName.equals(anotherPerson.getLastName()))
            return firstName.compareTo(anotherPerson.getFirstName());
        else
            return lastName.compareTo(anotherPerson.getLastName());
    }
}