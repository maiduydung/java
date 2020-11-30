import java.io.IOException;
import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        concat(args);
    }

    public static void concat(String [] args){
        StringBuffer buf = new StringBuffer();
        Scanner scanner = new Scanner(System.in);
        String res ="";
        for(;;){
            String str = scanner.nextLine();
            if(str.length() == 0){
                break;
            }
            String temp = String.valueOf(str.charAt(0));
            buf.append(temp);
            res = buf.toString();
        }
        System.out.print(res);
    }
}
