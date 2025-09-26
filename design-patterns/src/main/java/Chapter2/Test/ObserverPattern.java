package Chapter2.Test;

import Chapter2.WeatherApp.Observers.CurrentConditionToDisplay;
import Chapter2.WeatherApp.Subject.WeatherData;

public class ObserverPattern {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        // Register the observer to the subject
        new CurrentConditionToDisplay(weatherData);
        // Changing the subject state so it should notify the observers
        weatherData.setMeasurements(30, 65, 1013.1f);
        weatherData.setMeasurements(28, 70, 1012.5f);
    }
}
