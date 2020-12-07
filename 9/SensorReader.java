import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class SensorReader {
    private float illuminance;
    private float humidity;
    private float airpressure;
    private float temperature;

    private String user;
    private String passwd;

    private List<Observer> observers = new ArrayList<Observer>();

    public SensorReader(String user, String passwd){
        this.user = user;
        this.passwd = passwd;
    }

    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public void deleteObserver(Observer observer){
        observers.remove(observer);
    }

    public void notifyObserver(){
        for(Observer observer: observers){
            observer.update(self);
        }
    }

    public void execute(String room){}

    public float getIlluminance(){
        return illuminance;
    }

    public float getHumidity(){
        return humidity;
    }

    public float getAirpressure(){
        return airpressure;
    }

    public float getTemperature(){
        return temperature;
    }

    private void getSensor(String room){}
}

