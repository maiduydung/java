public class quiz {
    public static void main(String[] args) {
        System.out.println(appendAll(args));
    }

    public static String appendAll(String[] args) {
        StringBuffer sbuf = new StringBuffer();
        for (String str: args){
            sbuf.append(str);
            sbuf.append(";");
        }
        return sbuf.toString();
    }
}