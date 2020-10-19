package sample2;

public class Member {
    static final String DOMAIN = "@iniad.org";
    
    String id;
    String name;

    String getEmail(){
        return this.id + DOMAIN;
    }
}