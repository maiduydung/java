public class Button{
    public final String label;
    private boolean pressed = false;
    private static int numPressed = 0;

    public Button(){
        this.label = "Untitled";
    } 

    public Button(String label){
        this.label = label;
    }

    public void press(){
        this.pressed = true;
        numPressed++;
    }

    public void release(){
        this.pressed = false;
    }

    public boolean isPressed(){
        return pressed;
    }

    public static int getNumPressed(){
        return numPressed;
    }
}