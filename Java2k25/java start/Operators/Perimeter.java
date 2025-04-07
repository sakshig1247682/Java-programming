//Create a program to calculate perimeter of the rectangle
import java .util.Scanner;

public class Perimeter {

    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
      System.out.println("We are calculating the perimeter of a rectangle!!");
      System.out.println("Enter the all 4 sides of the rectangle");

      int a=input.nextInt();
      int b=input.nextInt();
      int c=input.nextInt();
      int d=input.nextInt();

      int perimeter=a+b+c+d;
      System.out.println("The perimeter of the rectangle is: "+perimeter);

      input.close();

    }
}

