
public class Fruit {
    protected String state = "skinned";
    protected int pieceNumber = 1;

    private void cut(){
        this.pieceNumber = this.pieceNumber*2;
    }

    public int getPieceNumber(){
        return this.pieceNumber;
    }

    public void peel(){
        this.state = "peeled";
    }

    public String getState(){
        return this.state;
    }
}