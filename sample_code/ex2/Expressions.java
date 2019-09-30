package sample_code.ex2;

import java.lang.Math;

public class Expressions {

    public static void main(String[] args) {
        
        // Literal values
        System.out.println(123);
        System.out.println('c');
        System.out.println("A String");
        System.out.println(true);

        // Named values
        String name = "John";
        System.out.println(name);

        // Value retrived from an array
        int[] myIntegerArray = {10,11,12,13};
        System.out.println(myIntegerArray[0]);

        // Class/object fields
        System.out.println(Math.PI);

        // Value as a result of a method call
        System.out.println(circleArea(2));

        // Note: void methods do not return any value hence a call of a void method is not consider an expression
        johnsName();

        // Compound expressions of operators
        System.out.println(4 + 3*2);
    }

    public static double circleArea(double r) {
        return Math.PI * Math.pow(r, 2);
    }

    public static void johnsName() {
        System.out.println("John Doe");
    }
}