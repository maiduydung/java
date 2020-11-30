import java.time.LocalDate;

import java.time.Period; 
public class User{
    private int idCounter;
    private int id;
    private String familyName;
    private String firstName;
    private LocalDate birthday;

    public User(String firstName, String familyName, LocalDate birthday){
        this.firstName = firstName;
        this.familyName = familyName;
        this.birthday = birthday;
    }

    public String getName(){
        return firstName + " " + familyName;
    }

    public int getAge(LocalDate when){
        if ((birthday != null) && (when != null)) {
            return Period.between(birthday, when).getYears();
        } else {
            return 0;
        }
    }
    

}