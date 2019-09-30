package sample_code.ex1;

public class Person {

    //Fields of the Person class
    //Every person has a first name, last name, and age
    private String personFirstName;
    private String personLastName;
    private int personAge;

    public Person(String personFirstName, String personLastName, int personAge) {
        this.personFirstName = personFirstName;
        this.personLastName = personLastName;
        this.personAge = personAge;
    }

    public String getPersonName() {
        return this.personFirstName + " " + this.personLastName;
    }

    public int getPersonAge() {
        return this.personAge;
    }

    public void setAge(int age) {
        this.personAge = age;
    }

}