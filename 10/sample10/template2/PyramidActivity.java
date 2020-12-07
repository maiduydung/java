package sample10.template2;

import sample10.template2.Activity;

public class PyramidActivity extends Activity{
    protected void onStart(){
        System.out.println("PyramidActivity starts.");
    }
    

    protected void onStop(){
        System.out.println("PyramidActivity stops.");
    }

    protected void onInput(String input){
        System.out.printf("Your input: %s\n", input);
        Integer rows = Integer.parseInt(input);
        int  k = 0;

        for (int i = 1; i <= rows; ++i, k = 0) {
          for (int space = 1; space <= rows - i; ++space) {
            System.out.print("  ");
          }
    
          while (k != 2 * i - 1) {
            System.out.print("##");
            ++k;
          }
    
          System.out.println();
        }
    }
}
