package assignment1;

public class Square extends Figure {
    int width;
    public Square(int h){
        super(h);
        this.width = h;
    }

    public void draw(){
        int i = 1, j;
		while(i <= height)
		{
			j = 1;
			
			while(j <= height)
			{
				System.out.print("*"); 
				j++;
			}
			i++;
			System.out.print("\n"); 
		}	
	}
}