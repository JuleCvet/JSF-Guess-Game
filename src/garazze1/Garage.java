
package garazze1;

import static garazze1.ModelType.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Garage {

    private static ArrayList<Car> carList = new ArrayList<>();
    
    static Scanner scanner = new Scanner(System.in);

    public boolean addToGarage(Car c) {
        return carList.add(c);
    }

    
    public boolean removeFromGarage(Car c) {

        if (!(c.getModel().equals("BMW"))) {
            System.out.println("Du får inte. Jag älskar mina BMWn!");
            return false;
        } else {
            return carList.remove(c);
        }
    }

    
    public void seAllaBilar() {
        System.out.println(carList);
    }

    
    public void andraAttribut(int registreringsNummber) {

        for (Car m : carList) {//sekogash koga menuvame parametri, imame temp za zacuvuvanje na mestoto vo listata
            if (m.getRegistreringsNummber() == registreringsNummber) {

                System.out.println("1. Pris");
                System.out.println("2. Färg");
                System.out.println("3. Modell");

                System.out.print("\nVad vill du ändra?");
                int choice = scanner.nextInt();
                
                switch (choice){
                    case 1:
                        System.out.println("Nu har bilen priset "+m.getPrice());
                        System.out.println("Vilken ny pris ska vi sätta på bilen");
                        int nypris = scanner.nextInt();
                        m.setPrice(nypris);
                        System.out.println("Bilen har nu priset "+m.getPrice());
                        break;
                        
                    case 2:
                        System.out.println("Nu har bilen färg " + m.getColor());
                        System.out.println("Vilken ny färg ska vi sätta på bilen");
                        System.out.println("\n1:YELOW, \n2: RED, \n3:BLUE, \n4:BLACK");
                        ColorType c = ColorType.valueOf(scanner.nextLine().toUpperCase());
                        m.setColor(c);
                        
                    case 3:
                        System.out.println("Nu har bilen modell "+m.getModel());
                        System.out.println("Vilken ny modell ska vi sätta på bilen");
                        int nyModel=scanner.nextInt();
                        m.setModel("nyModel");
                        System.out.println("Bilen har nu modell "+m.getModel());
                        break;
                    default: 
                        System.out.println("Fel val.");
                        break;
                }
            }
        }
    }

    public boolean taBortBil(String model) {
        //Car temp = null;

        for (Car x : carList) {
            if(!(x.getModel().equals(BMW))){
                System.out.println("You can not take it, I love my BMWs");
            }
//            if (x.getModel().equals(model)) {
//                temp = x;
//            }
            return false;
        }
        return true;
    }
   
}
