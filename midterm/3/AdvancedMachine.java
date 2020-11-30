public final class  AdvancedMachine extends Machine{
    public AdvancedMachine(String model , int price){
        super(model, price);
    }
    
    // public int getTotalPrice(){

    // }
    @Override
    public int getPrice(){
        return  price + price*10/100;
    }
}
