package assignment1;

public class Figure {
    int height;
    public Figure(int h){
        this.height = h;
    }

    public void draw(){
        for (int i = 0; i < this.height; i++) {
            System.out.printf("\n");
        }
    }
}
