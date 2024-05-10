package task11;

import java.util.Scanner;

public class Question_6 {

    public static void login() throws Exception {
        //Storing the Username and Password
        String user1 = "welcome";
        String pass1 = "welcome@123";

        Scanner s = new Scanner(System.in);
        //To Read the Input as Username
        System.out.println("Enter the Username : ");
        String user2 = s.nextLine();
        //To Read the Input as Password
        System.out.println("Enter the Password : ");
        String pass2 = s.nextLine();

        //Condition to Check the both Credentials are Correct
        if ( user1.equals(user2) && pass1.equals(pass2)){
            System.out.println("Login Successfully");
        }
        //Condition if Password Mismatches
        else if (!pass1.equals(pass2)) {
            System.out.println("\n" + "Password is Invalid : Please Enter the Correct Password");
            throw new Exception();
        }
        else {
            System.out.println("Enter the Correct Username");
        }
    }

    public static void main(String[] args) {

        try {
            login();
        }
        catch (Exception e){
            System.out.println("\n" + "Caught the Exception");
            System.out.println(e);
        }
    }
}
