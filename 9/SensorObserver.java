

public class SensorObserver implements Observer{
    public void update(SensorReader subject){
        System.out.printf("%s\n", subject.getHumidity());
        System.out.printf("%s\n", subject.getTemperature());
        System.out.printf("%s\n", subject.getAirpressure());
    }
}
