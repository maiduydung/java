public class NameCard {
    private String firstName;
    private String familyName;
    private int id= 0;
    
    public NameCard(String firstName, String familyName ){
        this.firstName = firstName;
        this.familyName = familyName;
        this.id++;
    }

    public String getLabel(){
        return String.format("No. %d: %s %s", this.id, this.firstName, this.familyName);
    }
}
