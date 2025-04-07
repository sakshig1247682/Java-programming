public class UnaryOperator {
    public static void main(String[] args) {
        int a=10;
        int b=-a;
        System.out.println("The value of b is: " + b); // Output: The value of b is: -10

        int c=++a;
        System.out.println("The value of c is: " + c); // Output: The value of c is: 11

        int d=a--;
        System.out.println("The value of d is: " + d); // Output: The value of d is: 10

        int e=--a;
        System.out.println("The value of e is: " + e); // Output: The value of e is: 9
        
     int f= a++;
     System.out.println("The value of f is: " + f); // Output: The value of f is: 10

    }
}
