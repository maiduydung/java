import java.security.DrbgParameters.Reseed;

public class Combination {

    public static int fact(int n){
        int res = 1;
        for(int i = 1; i<=n; i++){
            res = i*res;
        }
        return res;
    }

    public static int combination(int n, int r) {
        int n_fact = fact(n);
        int r_fact = fact(r);
        int n_r_fact = fact(n-r);
        int res = n_fact/(r_fact*n_r_fact);
        return res;
    }

    public static void main(String[] args) {
        int n = 10;
        int r = 3;
        int c = combination(n, r);
        System.out.printf("C(%d, %d) = %d\n", n, r, c);
    }
}