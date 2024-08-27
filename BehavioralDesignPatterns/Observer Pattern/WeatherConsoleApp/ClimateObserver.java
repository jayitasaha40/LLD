
public class ClimateObserver implements IObserver {
  String name;
  WeatherObservable weather;
  String previousTemperature;
  String previousHumidity;

  public ClimateObserver(String name, WeatherObservable weather) {
    this.name = name;
    this.weather = weather;
  }

  public void update() {
    String currentTemp = weather.getTemperature();
    String currentHumidity = weather.getHumidity();

    if ((this.previousTemperature != null) && (this.previousHumidity != null)) {
      if ((!this.previousTemperature.equals(currentTemp)) || (!this.previousHumidity.equals(currentHumidity))) {
        System.out
            .println("Hi " + name + ", the temperature is " + currentTemp + " the humidity is " + currentHumidity);
        this.previousHumidity = currentHumidity;
        this.previousTemperature = currentTemp;
      }
    } else {
      if ((currentTemp != null) || (currentHumidity != null)) {
        System.out
            .println("Hi " + name + ", the temperature is " + currentTemp + " the humidity is " + currentHumidity);
        this.previousHumidity = currentHumidity;
        this.previousTemperature = currentTemp;
      }
    }

  }
}