package ie.gmit.scannerpack;

import java.util.Scanner;

public class ScanFlow {


    public static void main(String[] args) {
        birthMonthFinder(); // call method to print on sceen after executing code

    }// end main


     // create new method which will need to be called from main method to print
     // result to screen - birthMonthFinder();

    static void birthMonthFinder() {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter number of month you were born (e.g. May = 5) ");
        int birthMonth = userInput.nextInt();

        userInput.close(); // to protect input from hacking (and remove the orange warning bit)

       
        if (birthMonth == 1) {
            System.out.println("You were born in January.");
        } else if (birthMonth == 2) {
            System.out.println("You were born in February.");
        } else if (birthMonth == 3) {
            System.out.println("You were born in March.");
        } else if (birthMonth == 4) {
            System.out.println("You were born in April.");
        } else if (birthMonth == 5) {
            System.out.println("You were born in May.");
        } else if (birthMonth == 6) {
            System.out.println("You were born in June.");
        } else if (birthMonth == 7) {
            System.out.println("You were born in July.");
        } else if (birthMonth == 8) {
            System.out.println("You were born in August.");
        } else if (birthMonth == 9) {
            System.out.println("You were born in September.");
        } else if (birthMonth == 10) {
            System.out.println("You were born in October.");
        } else if (birthMonth == 11) {
            System.out.println("You were born in November.");
        } else if (birthMonth == 12) {
            System.out.println("You were born in December.");
        } else {
            System.out.println("Invalid input. Please enter number between 1-12.");
        } // end if/else

    }// end method birthMonthFinder and call it from main method to print result to the screen

}// end class
