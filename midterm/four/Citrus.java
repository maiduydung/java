package four;

public class Citrus extends Plant implements Edible{
    private String color;
    private boolean sweet = false;
    private boolean sour = true;

    public Citrus(int price, String color, boolean sweet){
        super(price);
        this.color = color;
        this.sweet = sweet;
    }

    public boolean isSweet(){
        return sweet;
    }

    public boolean isSour(){
        return sour;
    } 
    
    public String getColor(){
        return color;
    }
    
}
