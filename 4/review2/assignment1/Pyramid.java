package assignment1;

public class Pyramid extends Figure {
    public Pyramid(int h){
        super(h);
    }

    public void draw(){
        int k = 0;
        for(int i = 1; i <= height; ++i, k = 0) {
            for(int space = 1; space <= height - i; ++space) {
                System.out.print(" ");
            }

            while(k != 2 * i - 1) {
                System.out.print("*");
                ++k;
            }
            System.out.println();
        }
    }
}
