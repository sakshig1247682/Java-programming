import java.util.Scanner;

public class Shorthandoperator {
    public static void main(String[] args) {
        int  a=10;
        Scanner input=new Scanner(System.in);
        int x=input.nextInt();
        a+=x; //a=a+x
        System.out.println("Value of a after shorthand operator: "+a);

        int y=input.nextInt();
        a-=y; //a=a-y
        System.out.println("Value of a after shorthand operator: "+a);

        int z=input.nextInt();
        a*=z; //a=a*z
        System.out.println("Value of a after shorthand operator: "+a);

        int w=input.nextInt();
        a/=w; //a=a/w
        System.out.println("Value of a after shorthand operator: "+a);

        int b=input.nextInt();
        a%=b; //a=a%b
        System.out.println("Value of a after shorthand operator: "+a);

    }
}
