package Chapter2.WeatherApp.Subject;

import Chapter2.WeatherApp.Interfaces.Observer;
import Chapter2.WeatherApp.Interfaces.Subject;

import java.util.List;

public class WeatherData implements Subject {
    public List<Observer> observers;
    float temperature, humidity, pressure;

    public WeatherData() {
        observers = new java.util.ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(temperature, humidity, pressure);
        }
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers();
    }
}
