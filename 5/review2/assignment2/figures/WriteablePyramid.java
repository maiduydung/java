package assignment2.figures;
//import assignment2.base.Figure;
import assignment2.base.Writeable;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteablePyramid extends Pyramid implements Writeable{
    public WriteablePyramid(int h){
        super(h);
    }

    @Override
    public void write(String filename){
        try {
            File file = new File(filename);
            FileWriter write = new FileWriter(file);

            int k = 0;
            for(int i = 1; i <= height; ++i, k = 0) {
                for(int space = 1; space <= height - i; ++space) {
                    //System.out.print(" ");
                    write.write(" ");
                }
    
                while(k != 2 * i - 1) {
                    //System.out.print("*");
                    write.write("*");
                    ++k;
                }
                //System.out.println();
                write.write("\n");
            }
            write.close();
        } catch (IOException e) {
            System.out.printf("err\n");
        }
    }
    
}
