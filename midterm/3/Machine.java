public class Machine{
    protected String model;
    protected int price;
    public Machine(String model, int price){
        this.model = model;
        this.price = price;
    }

    public String getModel(){
        return model;
    }

    public int getPrice(){
        return price;
    }
}