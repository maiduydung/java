package ass1;

import java.time.LocalDate;

public class User {
    static private int idCounter = 1;
    private int id;
    private String familyName;
    private String firstName;
    private LocalDate birthDay;

    public User(String firstname, String familyname, LocalDate birthday){
        this.firstName = firstname;
        this.familyName = familyname;
        this.birthDay = birthday;
        this.id = idCounter;

        idCounter++;
    }

    public String getName(){
        return String.format("%s %s", firstName, familyName);
    }

    public int getAge(LocalDate when){
        return birthDay.until(when).getYears();
    }

    public int getId(){
        return id;
    }
}
