public class Button {
    String label;
    Boolean pressed = false;
    static int numPressed;

    Button(String label){
        this.label = label;
    }

    Button(){
        this.label = "Untitled";
    }

    void press(){
        this.pressed = true;
        numPressed = numPressed + 1;
    }

    void release(){
        this.pressed = false;
        numPressed = numPressed - 1;
    }
}
