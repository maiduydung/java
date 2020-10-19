import java.io.IOException;
import java.io.File;
import java.io.FileWriter;


public class MyLogger{
    private final File filename;
    private int cnt = 0;
    private static int numInstances = 0;

    public MyLogger(String filename){
        if(numInstances < 3)
        {
            this.filename = new File(filename);;
            numInstances++;
        }
        else
        {
            throw new UnsupportedOperationException("Invalid operation");
        }
    }

    public void write(String str){
        try{

            FileWriter writer = new FileWriter(this.filename,true);
            writer.write(str);
            writer.write("\n");
            writer.write("\n");
            writer.close();
            cnt++;
        } catch(IOException e){
            System.out.println("Unable to write\n");
        }
    }
    public int count()
    {
        return cnt;
    }
}