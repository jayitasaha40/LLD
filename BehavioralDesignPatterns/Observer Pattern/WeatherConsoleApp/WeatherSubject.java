import java.util.ArrayList;

public class WeatherSubject implements WeatherObservable {

  ArrayList<IObserver> observers = new ArrayList<IObserver>();
  String temperature;
  String humidity;
  String precipitation;

  public void addObserver(IObserver observer) {
    observers.add(observer);
  }

  public void removeObserver(IObserver observer) {
    observers.remove(observer);
  }

  public void setTemperature(String temperature) {
    this.temperature = temperature;
    notifyObservers();
  }

  public String getTemperature() {
    return temperature;
  }

  public void setHumidity(String humidity) {
    this.humidity = humidity;
    notifyObservers();
  }

  public String getHumidity() {
    return humidity;
  }

  public void setPrecipitation(String precipitation) {
    this.precipitation = precipitation;
    notifyObservers();
  }

  public String getPrecipitation() {
    return precipitation;
  }

  public void notifyObservers() {
    for (IObserver observer : observers) {
      observer.update();
    }
  }
}
