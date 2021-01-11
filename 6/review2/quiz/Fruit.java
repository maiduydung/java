package quiz;

public abstract class Fruit {
    private double weight;
    public Fruit(double w){
        this.weight = w;
    }

    public double getWeight(){
        return this.weight;
    }

    abstract public String getColor();

}
