public class TestBook{
    public static void main(String[] args) {
        Author a = new Author("Alice","alice@example.com");
        Book b = new Book("Dummybook",a,5000);

        System.out.println(b.getName());
        System.out.println(b.getAuthor());
        System.out.println(b.getPrice());

        a.setEmail("alice2@example.com");
        b.setPrice(5500);
        
        System.out.println(b.getName());
        System.out.println(b.getAuthor());
        System.out.println(b.getPrice());
    }
}
