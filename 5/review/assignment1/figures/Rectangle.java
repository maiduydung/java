package review.assignment1.figures;
import review.assignment1.base.Figure;

public class Rectangle extends Figure{
    protected int width;
    public Rectangle(int h, int w){
        super(h);
        this.width = w;
    }

    @Override
    public void draw() {
        int i = 1, j;
		while(i <= height){
			j = 1;
			while(j <= width){
				System.out.print("*"); 
				j++;
			}
			i++;
			System.out.print("\n"); 
		}	
    } 
}
