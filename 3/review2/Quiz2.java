public class Quiz2 {
    public static void main(String[] args) {
        System.out.print(sumAll(args));
    }
    public static int sumAll(String [] args){
        int res = 0;
        try{
            for(String s : args){
                int i = Integer.parseInt(s);
                res = res + i;
            }
        } catch(NumberFormatException e){
            return 0;
        }
        return res;
    }
}
