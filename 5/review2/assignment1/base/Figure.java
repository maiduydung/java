package assignment1.base;

public class Figure {
    protected int height; //remember to use protected access modifier
    public Figure(int h){
        this.height = h;
    }

    public void draw(){
        for (int i = 0; i < this.height; i++) {
            System.out.printf("\n");
        }
    }
}
