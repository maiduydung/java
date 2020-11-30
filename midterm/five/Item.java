package five;

import java.util.Objects;

abstract public class Item implements Comparable<Member>{
    private String name;
    public Item(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    @Override
    public int compareTo(Item i1){
        return Objects.equals(name,i1.name );
    }

}
