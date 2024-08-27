// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {
    // Weather Subject
    WeatherSubject weatherStation = new WeatherSubject();

    // Observers
    ClimateObserver climateObserver1 = new ClimateObserver("Climate Observer1", weatherStation);
    ClimateObserver climateObserver2 = new ClimateObserver("Climate Observer2", weatherStation);
    RainObserver rainObserver1 = new RainObserver("Jayita", weatherStation);
    ClimateObserver climateObserver3 = new ClimateObserver("Jayita", weatherStation);
    // Adding Observers
    weatherStation.addObserver(climateObserver1);
    weatherStation.addObserver(climateObserver2);
    weatherStation.addObserver(climateObserver3);
    weatherStation.addObserver(rainObserver1);
    weatherStation.setPrecipitation("20%");
    weatherStation.setTemperature("30 degree");

  }

}