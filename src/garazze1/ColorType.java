
package garazze1;

public enum ColorType {
  YELLOW, RED, BLUE, BLACK, WHITE;  

    
    public String toString() {
       switch (this){
           case YELLOW:
               return "Yellow";
           case RED:
               return "Red";
           case BLUE:
               return "Blue";
           case BLACK:
               return "Black";
           case WHITE:
               return "White";
           default:
               return "There is no car in garage with that color.";
       }
    }
}
