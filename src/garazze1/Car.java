
package garazze1;

public class Car {
    //attribut eller fält
    private int registreringsNummber;//nema set metod
    private static int carIdGenerator = 1;
    
    private String model; 
    private int price;
    private ColorType color;

    public Car(String model, int price, ColorType color) {//parameter int price till ex.
        
        this.registreringsNummber=carIdGenerator;//zatoa nema set metod
        carIdGenerator++;
        
        this.model = model;
        this.price = price;
        this.color = color;
    }

    public int getRegistreringsNummber() {
        return registreringsNummber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public ColorType getColor() {
        return color;
    }

    public void setColor(ColorType color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return  "model=" + model + ", price=" + price + ", color=" + color;
    }
    
    
    
    
}

