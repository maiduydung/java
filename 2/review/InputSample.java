import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class InputSample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        Scanner scanner = new Scanner(System.in);
        for(;;){
            String str = scanner.nextLine();
            if(str.length() == 0){
                break;
            }
            sb.append(str);
            sb.append("\n");
        }
        String res = sb.toString();
        System.out.printf("%s", res);
        //always put these is try-catch block
        try{
            File file = new File("output.txt");
            FileWriter fw = new FileWriter(file, true);
            fw.write(res);
            fw.close();
        }
        catch(IOException e){
            System.out.println("err\n");
        }


    }
}
