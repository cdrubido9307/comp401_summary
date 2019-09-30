package sample_code.ex1;

public class ValueTypes {

    public static void main(String[] args) {

        // byte Value Type 
        // The memory size is 8 bits (Can hold values from -128 to 127)
        // Correct declaration
        byte validByte = 100; 
        System.out.println(validByte);
        /*
        // Incorrect declaration
        byte invalidByte = 129; 
        System.out.println(invalidByte);
        */

        // short Value Type
        // The memory size is 2 bytes or 16 bits (Can hold values from -32,768 to 32,767)
        // Correct declaration
        short validShort = -32000;
        System.out.println(validShort);
        /*
        // Incorrect declaration
        short invalidShort = -32769; 
        System.out.println(invalidShort);
        */

        // int Value Type
        // The memory size is 4 bytes or 32 bits (Can hold values from -2,147,483,648 to 2,147,483,647)
        // Correct declaration
        int validInt = 2147483647;
        System.out.println(validInt);
        /*
        // Incorrect declaration
        int invalidInt = 2147483648; 
        System.out.println(invalidInt);
        */

        // long Value Type
        // The memory size is 8 bytes or 64 bits (Can hold values from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807)
        // Correct declaration
        long validLong = -9223372036854775808;
        System.out.println(validLong);
        /*
        // Incorrect declaration
        long invalidLong = 9223372036854775808; 
        System.out.println(invalidLong);
        */

        // float Value Type
        // The memory size is 4 bytes or 32 bits stores 7 digits after the decimal point
        //Correct declaration
        float validFloat = 3.141593;
        System.out.println(validFloat);
        /*
        // Incorrect declaration
        float invalidFloat = 3.141592654; 
        System.out.println(invalidFloat);
        */

        // double Value Type
        // The memory size is 8 bytes or 63 bits stores 15 digits after the decimal point
        // Correct declaration
        double validDouble = 3.14159265359;
        System.out.println(validDouble);

        // char Value Type
        // 16-bit Unicode value
        // correct declaration
        char validChar = 'c';
        char otherValidChar = '\u0063';
        System.out.println(validChar);
        System.out.println(otherValidChar);
        /*
        // Incorrect declarationvalidBool
        char invalidChar = 'abc'; 
        System.out.println(invalidChar);
        */

        // boolean Value Type
        // Size is not precisely defined
        // correct declaration
        boolean validBool = true;
        boolean otherValidBool = false;
        System.out.println(validBool);
        System.out.println(otherValidBool);
    }
}