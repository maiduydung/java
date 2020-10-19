public class TestTime{
    public static void main(String[] args) {
        Time t = new Time(16,7,30);

        t.setHour(17);

        System.out.printf("%s\n",t.getCurrentTime());
    }
}