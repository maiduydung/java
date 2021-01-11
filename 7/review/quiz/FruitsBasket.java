package quiz;

import java.util.List;
import java.util.ArrayList;

public class FruitsBasket {
    private List<Fruit> fruits = new ArrayList<Fruit>();
    public void add(Fruit fruit){
        fruits.add(fruit);
    }

    public void print(){
        for (Fruit fruit : fruits) {
            System.out.printf("%s\n", fruit.getColor());
        }
    }
}
