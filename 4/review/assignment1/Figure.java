package review.assignment1;

public class Figure{
    int height;
    Figure(int height){
        this.height = height;
    }

    public void draw(){
        for(int i = 0; i < height; i++){
            System.out.println("");
        }
    }
}
