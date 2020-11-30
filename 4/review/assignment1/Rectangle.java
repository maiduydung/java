package review.assignment1;

public class Rectangle extends Figure{
    int width;
    Rectangle(int h, int w){
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
