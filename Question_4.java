package task11;

import java.util.Scanner;

public class Question_4 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Two Numbers : ");
        //To read the input from user
        int x = s.nextInt();
        int y = s.nextInt();

        //Dividing the two numbers
        int z = x / y;
        System.out.println(z);
    }
}
