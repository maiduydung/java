package fac;

public class Factorial implements Function{
    @Override
    public double evaluate(double x){
        return x*x;
    }


    public int factorial_of_ten(){
        int res = 1;
        for (int i = 1; i < 11; i++) {
            res = res*i;
        }
        return res;
    }


}