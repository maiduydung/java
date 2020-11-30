package quiz;

abstract public class Fruit{
    private double weight;
    private String color;
    public Fruit(double w){
        this.weight = w;
    }

    public double getWeight(){
        return weight;
    }

    public String getColor(){
        return color;
    }

}