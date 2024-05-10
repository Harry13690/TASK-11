package task11.Question_7;
import java.util.Scanner;

public class ForVote {
    //Function to Validate the User's Age
    public static void ageValidation() throws InvalidAgeException {

        Scanner s = new Scanner(System.in);
        //To Read the Input from User
        System.out.println("Enter Your Age : ");
        int x = s.nextInt();
        //Condition if Age is Below 18
        if (x < 18){
            throw new InvalidAgeException("You are below 18");
        }
        //Otherwise Age is Equals to or Above 18
        else {
            System.out.println("You are Eligible to Vote");
        }
    }

    public static void main(String[] args){
        //Keeping the code Inside that might throw an Error
        try{
            ageValidation();
        }
        //Catching the Exception
        catch(InvalidAgeException exception){
            System.out.println("Caught the Exception");
            System.out.println("\n" + "Exception Occurred "+ "\n" + exception);
        }

    }
}
