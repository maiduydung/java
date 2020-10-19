package assignment1;

public class Rectangle extends Figure{

    int width;
    Rectangle(int height, int width){
        super(height);
        this.width = width;
    }

    void draw(){
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