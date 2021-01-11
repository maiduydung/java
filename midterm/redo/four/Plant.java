package four;
abstract public class Plant {
    private int price;

    public Plant(int p){
        this.price = p;
    }

    public int getPrice(){
        return price;
    }

    public abstract String getColor();
}
