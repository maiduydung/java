public class Button {
    public final String label;
    private boolean pressed = false;
    private static int NumPressed = 0;

    public Button(String label){
        this.label = label;
    }

    public Button(){
        this.label = "Untitled";
    }

    public boolean isPress(){
        return this.pressed;
    }

    public void press(){
        this.pressed = true;
        Button.NumPressed++;
    }

    public void release(){
        this.pressed = false;
        Button.NumPressed--;
    }

    public static int getNumPressed(){
        return NumPressed;
    }

}
