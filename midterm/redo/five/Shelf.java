package five;

import java.util.LinkedList;
import java.util.Collections;

public class Shelf {
    private LinkedList<Item> list = new LinkedList<>();

    public void push(Item item){
        list.add(item);
    }

    public void print(){
        Collections.sort(list);
        for (Item item : list) {
            System.out.printf("%s\n", item.getName());
        }
    }
}
