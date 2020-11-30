public class quiz_sum {
    public static void main(String[] args) {
        System.out.println(sumAll(args));
    }

    public static int sumAll(String[] args) {
        int res = 0;
        try{
            for(String ele : args){
                res = res + Integer.parseInt(ele);
            }
        } catch(NumberFormatException e){
            return 0;
        }
        return res;
    }
}