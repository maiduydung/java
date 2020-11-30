import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MyLogger {
    private String filename;
    private int cnt;
    private int numInstance;

    public MyLogger(String fname){
        this.filename = fname;
        numInstance++;
        if(num > 3) {
            throw new UnsupportedOperationException();
        }
    }

    public void write(String content){
        try{
            cnt ++;
            File file = new File(this.filename);
            FileWriter writer = new FileWriter();
            writer.write(content+"\n\n");
            writer.close();
        }
        catch(IOException e){
            System.out.println("error\n");
        }
    }

    public int count(){
        return cnt;
    }
}
