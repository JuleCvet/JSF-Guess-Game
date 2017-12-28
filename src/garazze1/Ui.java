
package garazze1;

import java.util.Scanner;

public class Ui {
    
    public static int menu() {
        
        Scanner scanner = new Scanner(System.in);
      
        System.out.println("1. Lägga in en bil i garagen");
        System.out.println("2. Se all bilar");
        System.out.println("3. Ändra en bil attribut");
        System.out.println("4. Ta bort bil");
        
        System.out.println("Make a choise: ");
        int choice = scanner.nextInt();
        return choice;
               
    }
}
