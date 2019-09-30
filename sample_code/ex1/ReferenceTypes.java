package sample_code.ex1;

public class ReferenceTypes {

    public static void main(String[] args) {
        /*
        The following examples are reference types.
        */

        //Name of a student
        String validString = "Carlos";
        //Array of integers (size 10) to store the ages of 10 students
        int[] age = new int[10]; 
        //Array of doubles (size 20) to store the salary of 20 professors
        double[] salary = new double[20];
        // Any object or any class for example a Person object
        Person newPerson = new Person("John", "Doe", 21);
        // Array of objects for example array of Persons to store 100 persons
        Person[] persons = new Person[100];
    }
}