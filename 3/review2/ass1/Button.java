public class Button {
    String label;
    boolean pressed;
    static int NumPressed = 0;
    Button(String label){
        this.label = label;
        this.pressed = false;
    }

    Button(){
        this.label = "Untitled";
        this.pressed = false;
    }

    void press(){
        this.pressed = true;
        Button.NumPressed++;
    }

    void release(){
        this.pressed = false;
        Button.NumPressed--;
    }

    int getNumPressed(){
        return Button.NumPressed;
    }
}
