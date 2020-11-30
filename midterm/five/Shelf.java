package five;

//import java.lang.reflect.Member;
import java.util.Collections;

public class Shelf {
    List<Item> shelf = new ArrayList<Item>();

    public void push(Item item){
        shelf.add(item);
    }

    public void print(){
        Collections.sort(shelf);
        for(Item m : lst) {
            System.out.println(m.getName());
        } 
    }
}
