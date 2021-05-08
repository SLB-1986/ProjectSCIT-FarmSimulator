package usersFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class User {
    public void run() throws FileNotFoundException {
        Scanner scan = new Scanner(new File("C//Users//Cuprins//Desktop//User and Password")); // the file to check
        Scanner typed = new Scanner(System.in); // for typed input

        String username;
        String password;

        username = scan.nextLine();
        password = scan.nextLine(); // check the selected file in the pathname

        String inpUser = typed.nextLine();
        String inpPass = typed.nextLine(); // take the input from the username

        if (inpUser.equals(username) && inpPass.equals(password)) {
            System.out.println("You are logged in.");
        } else if(inpUser.equals(username)){
            System.out.println("Wrong password.");
        }
        else if(inpPass.equals(password)){
            System.out.println("Wrong username.");
        }else{
            System.out.println("Wrong username and password.");
        }
    }

}
