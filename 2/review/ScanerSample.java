import java.util.Scanner;

public class ScanerSample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for(;;){
            String str = scanner.next();
            System.out.printf(str);
        }
    }
}
