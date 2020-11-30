package quiz;

public class Apple extends Fruit implements Sellable{
    private int price;
    public Apple(double w, int p){
        super(w);
        this.price = p;
    }
    @Override
    public String getColor() {
        // TODO Auto-generated method stub
        return "red";
    }

    @Override
    public int getPrice() {
        // TODO Auto-generated method stub
        return price;
    }
}
