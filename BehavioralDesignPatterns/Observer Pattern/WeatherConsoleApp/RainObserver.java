public class RainObserver implements IObserver {
  String name;
  String previousPreciptation;
  WeatherObservable weather;

  public RainObserver(String name, WeatherObservable weather) {
    this.name = name;
    this.weather = weather;
  }

  public void update() {
    String currentPreciptation = weather.getPrecipitation();
    if (this.previousPreciptation != null) {
      if (!this.previousPreciptation.equals(currentPreciptation)) {
        System.out.println("Hi " + name + ", the precipitation is " + currentPreciptation);
        this.previousPreciptation = currentPreciptation;
      }
    } else {
      if (currentPreciptation != null) {
        System.out.println("Hi " + name + ", the precipitation is " + currentPreciptation);
        this.previousPreciptation = currentPreciptation;
      }
    }

  }
}