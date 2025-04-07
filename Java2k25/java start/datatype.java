public class datatype {
    public static void main(String[] args) {
        // Integer data types
        byte byteValue = 127;  // Range: -128 to 127
        short shortValue = 32000;  // Range: -32,768 to 32,767
        int intValue = 2147483647;  // Range: -2^31 to (2^31)-1
        long longValue = 9223372036854775807L;  // Range: -2^63 to (2^63)-1
        
        // Floating-point data types
        float floatValue = 3.14f;  // 32-bit floating point
        double doubleValue = 3.14159265359;  // 64-bit floating point
        
        // Character data type
        char charValue = 'A';  // Single character
        
        // Boolean data type
        boolean booleanValue = true;  // true or false
        
        // Displaying the values
        System.out.println("Byte Value: " + byteValue);
        System.out.println("Short Value: " + shortValue);
        System.out.println("Int Value: " + intValue);
        System.out.println("Long Value: " + longValue);
        System.out.println("Float Value: " + floatValue);
        System.out.println("Double Value: " + doubleValue);
        System.out.println("Char Value: " + charValue);
        System.out.println("Boolean Value: " + booleanValue);
    }
}
