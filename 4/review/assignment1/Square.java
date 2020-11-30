package review.assignment1;

public class Square extends Figure{
    int width;
    Square(int h){
        super(h);
        this.width = h;
        
    }
    @Override
    public void draw() {
        int i = 1, j;
		while(i <= height){
			j = 1;
			while(j <= height){
				System.out.print("*"); 
				j++;
			}
			i++;
			System.out.print("\n"); 
		}
    }
}
