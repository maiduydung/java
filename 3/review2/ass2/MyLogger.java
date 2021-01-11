import java.io.IOException;
import java.io.File;
import java.io.FileWriter;

public class MyLogger {
    private final String filename;
    private int cnt; //write times
    static private int numInstances = 0;

    public MyLogger(String name){
        MyLogger.numInstances ++;
        if (MyLogger.numInstances <= 3) {
            this.filename = name;    
        }else throw new UnsupportedOperationException();
        
    }

    public write(String filename){
        cnt ++;
        try{
            File file = new File( filename);
            FileWriter writer = new FileWriter(file);
            writer.write(filename + "\n\n");
            writer.close();
        }
        catch(IOException e){
            System.out.printf("err\n");
        }
    }

    public int count(){
        return cnt;
    }
}
