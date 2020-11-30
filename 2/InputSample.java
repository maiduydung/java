import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class InputSample {
        public static void main(String[] args) {
            StringBuffer buf = new StringBuffer();
            Scanner scanner = new Scanner(System.in);
            String res ="";
            for(;;){
                String str = scanner.nextLine();
                if(str.length() == 0){
                    break;
                }
                buf.append(str);
                buf.append("\n");
                res = buf.toString();
            }
            System.out.print(res);

            //print to file
            try{
                File file = new File("result.txt");
                FileWriter writer = new FileWriter(file);
                writer.write(res);
                writer.close();
            }catch(IOException e){
                System.out.println("error\n");
            }
        }
}