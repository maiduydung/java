final public class AdvancedMachine extends Machine {
    private static int totalPrice;
    public AdvancedMachine(String m, int p){
        super(m,p);
        totalPrice += p;
    }

    public int getPrice(){
        return (price*10/100) + price;
    }

    public static int getTotalPrice(){
        return totalPrice;
    }
}
