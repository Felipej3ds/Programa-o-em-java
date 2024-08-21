public class data_type { //a fundamental topic of anny programing leanguage are data types
/*topics 
 * how to manipulate primitive data
 * how to get data from users 
 * how to format data
 * how data is stored and managed
 * difference between reference data type and primitive 
 */
    public static void primitivo(String[] srgs){ 
        /*Java has eigh primitive data tipes 
         * They are reserved keywords
         * keywords can't be used as variable name
        */  

        // integer values
        @SuppressWarnings("unused")
        byte myByte = 100; //it's a 8 bits signed can hold numbers from -128 to 127
        @SuppressWarnings("unused")
        short myShort = 32727; //it's a 16 bits signed can hold numbers from -32768 to 32767
        @SuppressWarnings("unused")
        int myint = 2147483647; // its a 32 bits signed can hold numbers from -2,147,483,648 to 2,147,483,647
        @SuppressWarnings("unused")
        long mylong = Long.MAX_VALUE;


        // Float values
        @SuppressWarnings("unused")
        float myFloat = 3.14F; 
        @SuppressWarnings("unused")
        double mydouble = 32.4444;

        //boolean value
        @SuppressWarnings("unused")
        boolean ispythonfun = true;

        //char
        @SuppressWarnings("unused")
        char Mygrade = 'B'; //is a primitive data type used to represent a single 16-bit Unicode character
        @SuppressWarnings("unused")
        char letter = 'A';       // Single character
        @SuppressWarnings("unused")
        char digit = '5';        // Single character representing a digit
        @SuppressWarnings("unused")
        char specialChar = '$';  // Single character representing a special symbol
        @SuppressWarnings("unused")
        char newline = '\n';     // Escape sequence for newlin

    }
    
    public static void referenciais(String[] srgs){
        /*
         * Reference data types store references or memory addresses that point to objects stored in memory
         * The reference types hold the references of objects. All reference types are a subclass of type java.lang.Object
         */

         // Strings
         @SuppressWarnings("unused")
        String name = "Fulano"; //String class represents a sequence of characters

        //Arrays
        @SuppressWarnings("unused")
        int[] numbers = {1,2,3,4,5}; //are used to store a collection of elements of the same type

    }

}
