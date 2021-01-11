package five;

public class Item implements Comparable<Item>{
    private String name;
    public Item(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    @Override
    public int compareTo(Item i) {
        // TODO Auto-generated method stub
        return name.compareTo(i.name);
    }

}
