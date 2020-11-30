public class ArraySample {
    public static void main(String[] args) {
        int[] array1 = {1, -2, 3, 4, -5};
        int result = positive(array1);
        System.out.println(result);

        String[] array2 = {"Information", "Networking", "for", "Innovation", "And", "Design"};
        printOdd(array2);
    }
		
    public static int positive(int[] array) {
        int cnt = 0;
		for(int ele : array){
            if(ele > 0){
                cnt = cnt + 1;
            }
        }
        return cnt;
    }
    
    public static void printOdd(String[] array) {
		for(String mini_arr : array){
            if(mini_arr.length()% 2 != 0){
                System.out.printf("%s\n", mini_arr);
            }
        }

    }
}
