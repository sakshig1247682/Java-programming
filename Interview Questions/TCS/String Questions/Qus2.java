// One commonly asked TCS Technical Interview question in Java is:

// Question:
// 🔹 What is the difference between String, StringBuilder, and StringBuffer in Java?

public class Qus2 {
    public static void main(String[] args) {
        // String (Immutable)
        String str = "Hello";
        str += " World";  // Creates a new object
        System.out.println(str); // Output: Hello World

        // StringBuilder (Mutable & Fast)
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println(sb); // Output: Hello World

        // StringBuffer (Thread-Safe)
        StringBuffer sbf = new StringBuffer("Hello");
        sbf.append(" World");
        System.out.println(sbf); // Output: Hello World
    }
}
