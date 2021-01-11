package assignment2.base;

abstract public class Figure {
    protected int height; //remember to use protected access modifier
    public Figure(int h){
        this.height = h;
    }

    abstract public void draw();
}
