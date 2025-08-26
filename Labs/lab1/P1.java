package Labs.lab1;

import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter movie preference (A/C/D): ");
        char choice = userInput.next().charAt(0);

        switch (choice) {
            case 'A':
            case 'a':
                System.out.println("Action movie fan");
                break;
            case 'C':
            case 'c':
                System.out.println("Comedy movie fan");
                break;
            
            case 'D':
            case 'd':
                System.out.println("Drama movie fan");
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
        userInput.close();
    }
} 