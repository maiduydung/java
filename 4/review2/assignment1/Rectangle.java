package assignment1;

public class Rectangle extends Figure {
    int width;
    public Rectangle(int h, int w){
        super(h);
        this.width = w;
    }

    public void draw(){
        int i = 1, j;
		while(i <= height)
		{
			j = 1;
			
			while(j <= width)
			{
				System.out.print("*"); 
				j++;
			}
			i++;
			System.out.print("\n"); 
		}	
	}
}
