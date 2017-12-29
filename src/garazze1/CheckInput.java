
package garazze1;

import static garazze1.Main.sc;

public class CheckInput {

    public static int readUserInputInt() {
         while (!sc.hasNextInt()) {//dodeka ne vnesuva broj
            sc.next();        
            System.out.print("You didn't enter a number, please try again: ");
//sleden input odi
        }
        int inputInt =sc.nextInt();
        sc.nextLine();
        return inputInt;

    }
    public static String readUserInputString() {

        while (!sc.hasNextLine()) {
            System.out.print("You didn't enter letters, please try again: ");
            sc.next();
        }
        String inputString = sc.nextLine();
        return inputString;
    }
}


