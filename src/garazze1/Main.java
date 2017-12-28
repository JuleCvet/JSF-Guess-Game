package garazze1;

import java.util.Scanner;
import static garazze1.Ui.*;
public class Main {

    static Scanner sc = new Scanner(System.in);
    static Garage garage = new Garage();//se povrzuvame so garazza

    public static void main(String[] args) {

        garage.addToGarage(new Car("Volvo", 123, ColorType.BLUE));

        Car c = new Car("Audi", 1230000, ColorType.BLACK);
        garage.addToGarage(c);
        garage.addToGarage(new Car("BMW", 123456, ColorType.RED));
        garage.seAllaBilar();

        switchMenu(menu());//importirano e gore Ui(vo nego e menito)
    }

    private static void switchMenu(int menu) {
        switch (menu) {
            case 1:
                System.out.println("Vilken model");
                String model = sc.nextLine();

                System.out.println("Vilken färg?");
                //int color = sc.next().indexOf(ColorType);
                int colorInt = CheckInput.readUserInputInt();
                ColorType newColor;
                if (colorInt == 1) {
                    newColor = ColorType.YELLOW;
                } else if (colorInt == 2) {
                    newColor = ColorType.RED;
                } else if (colorInt == 3) {
                    newColor = ColorType.BLUE;
                } else if (colorInt == 4) {
                    newColor = ColorType.BLACK;
                } else if (colorInt == 5) {
                    newColor = ColorType.WHITE;
                }

                System.out.println("Sega kolata imat vakva boja: " + ColorType.WHITE);

                System.out.println("Vilken Price?");
                int price = sc.nextInt();
                sc.nextLine();

                Car c = new Car(model, price, ColorType.BLACK);
                garage.addToGarage(c);
                garage.seAllaBilar();
                break;
            case 2:
                garage.seAllaBilar();
                break;
            case 3:
                System.out.println("vilken registeringnummer");
                garage.andraAttribut(sc.nextInt());
                sc.nextLine();
                garage.seAllaBilar();
                break;
            case 4:
                System.out.println("vilken model");
                garage.taBortBil(sc.nextLine());
                garage.seAllaBilar();
                break;
            default:
                System.out.println("You didn't choose any of above, try again.");
        }
    }
}
