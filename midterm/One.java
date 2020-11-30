// package midterm;

// public class One{
//     public static void main(String[] args) {
//         product(args);
//     }

//     public static void product(String [] args){
//         int res = 0;
//         try{
//             for(String str : args){
//                 res = res + Integer.parseInt(str);
//             }
//             System.out.printf("%d\n", res);
//         }catch(NumberFormatException e){
//             System.out.println("0");
//         }
//     }
// }


public class One {
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