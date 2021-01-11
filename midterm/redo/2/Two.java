import java.lang.StringBuffer;
import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        Scanner scanner = new Scanner(System.in);
        for(;;){
            String str = scanner.nextLine();
            if(str.length() == 0){
                break;
            }
            sb.append(str.charAt(0));
            sb.append("\n");
        }
        String res = sb.toString();
        System.out.printf("%s", res);
    }
}
