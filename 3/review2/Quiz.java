public class Quiz {
    public static void main(String[] args) {
        System.out.printf(appendAll(args));
    }
    public static String appendAll(String [] str){
        StringBuffer res = new StringBuffer();
        for(String s : str){
            res.append(s);
            res.append(";");
        }
        return res.toString();
    }
}
