package assignment1.figures;
import java.io.IOException; 
import java.io.FileWriter;

import assignment1.base.Writable;

public class WritePyramid extends Pyramid implements Writable{
    public WritePyramid(int height){
        super(height);
    }

    @Override
    public void Write(String filename){
        try{
            FileWriter file = new FileWriter(filename);
            file.write(height);
            file.close();
        }catch(IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}