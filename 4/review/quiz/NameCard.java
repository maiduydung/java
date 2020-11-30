import java.util.jar.Attributes.Name;

public class NameCard{
    private String firstName;
    private String familyName;
    private int id;
    private static int cnt = 1;


    NameCard(String firstName, String familyName){
        this.firstName = firstName;
        this.familyName = familyName;
        this.id = cnt++; 
    }


    public String getLabel(){
        return "No. " + this.id + " " + this.firstName + " "  + this.familyName;
    }


}