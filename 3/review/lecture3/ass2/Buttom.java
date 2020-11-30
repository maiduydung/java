public class Button {
    public final String label;
    private Boolean pressed = false;
    private static int numPressed;

    public Button(String label){
        this.label = label;
    }

    public Button(){
        this.label = "Untitled";
    }

    public void press(){
        this.pressed = true;
        numPressed = numPressed + 1;
    }

    public void release(){
        this.pressed = false;
        numPressed = numPressed - 1;
    }

    public Boolean isPressed(){
        return this.pressed;
    }

    public static int getNumPressed(){
        return numPressed;
    }
}
