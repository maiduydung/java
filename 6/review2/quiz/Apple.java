package quiz;

public class Apple extends Fruit implements Sellable {
    private int price = 100;
    public Apple(double weight, int price){
        super(weight);
        this.price = price;
    }

    public int getPrice(){
        return this.price;
    }

    public String getColor(){
        return "Red";
    }
    
}
