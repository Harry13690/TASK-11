package task11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Question_8 {
    //Function to Read the File
    public static void fileReader() throws IOException {
        //Storing the Path o the File in Variable
        FileReader fr = new FileReader("C:\\User\\Harry\\Downloads\\New Text Document.txt");
        BufferedReader br = new BufferedReader(fr);
        //Printing the Read Lines
        System.out.println(br.readLine());
    }

    public static void main(String[] args) {
        //Keeping the Method that might throw an error
        try {
            fileReader();
        }
        //catch the Exception
        catch (Exception e){
            System.out.println("Caught the Exception" + "\n");
            System.out.println("The File Doesn't Exist " + "\n" +  e);
        }
    }
}
