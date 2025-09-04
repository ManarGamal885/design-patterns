package Chapter2.WeatherApp.Observers;

import Chapter2.WeatherApp.Interfaces.DisplayElement;
import Chapter2.WeatherApp.Interfaces.Observer;
import Chapter2.WeatherApp.Subject.WeatherData;

public class CurrentConditionToDisplay implements Observer , DisplayElement {
    float temperature, humidity, pressure;
    WeatherData weatherData;

    // This is how we register an observer
    public CurrentConditionToDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println("Changed Current Condition to: " + temperature + "C degrees and " + humidity + "% humidity and " + pressure + " Pa pressure");
    }
}
