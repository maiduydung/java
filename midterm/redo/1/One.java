import java.lang.NumberFormatException;

public class One {
    public static void main(String[] args) {
        System.out.println(sumAll(args));
    }

    public static int sumAll(String[] args){
        int res = 0;
        try {
            for (String str : args) {
                res = res + Integer.parseInt(str);
            }
        } catch (NumberFormatException e) {
            return 0;
        }
        return res;
    }
}
