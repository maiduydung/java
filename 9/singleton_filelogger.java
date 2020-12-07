import java.io.File;
import java.io.FileWriter;
import java.io.IOException;



public class FileLogger {

    private static Singleton instance = new Singleton();
    private Singleton(){}
    public static Singleton getInstance(){
        return instance;
    }

    public void purchase(Customer customer, Item item) {
        try{
            File file = new File("result.txt");
            FileWriter writer = new FileWriter(file,true);
            writer.write(String.format("buy %s: %s(%d yen).\n", customer.getName(), item.getName(), item.getPrice()));
            writer.close();
        } catch(IOException e){
            System.out.println("err");
        }
    }

    public void balance(User user) {
        try{File file = new File("result.txt");
            FileWriter writer = new FileWriter(file, true);
            writer.write(String.format("balance %s: %d yen.\n", user.getName(), user.getBalance()));
            writer.close();
        } catch(IOException e){
            System.out.println("err");
        }
    }

    public void error(User user, String error) {
        try{File file = new File("result.txt");
            FileWriter writer = new FileWriter(file, true);
            writer.write(String.format("err %s: %s.\n", user.getName(), error));
            writer.close();
        } catch(IOException e){
            System.out.println("err.");
        }
    }
}