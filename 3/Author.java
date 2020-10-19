public class Author{
    String name;
    String email;
    public Author(String name, String email)
    {
        this.name = name;
        this.email = email;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }
    public String getName()
    {
        return this.name;
    }
    public String getEmail()
    {
    
        return this.email;
    }
    public String toString()
    {
        return "Author [name="+this.name+", email="+this.email+"]";
    }

    public static void main(String[] args) {
        Author au = new Author("Mai", "mai@yahoo.com");
        System.out.printf("%s\n", au.getEmail());
    }
}
