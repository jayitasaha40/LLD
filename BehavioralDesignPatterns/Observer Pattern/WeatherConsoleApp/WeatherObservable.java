public interface WeatherObservable extends Observable {
  void setTemperature(String temperature);

  void setHumidity(String humidity);

  void setPrecipitation(String precipitation);

  String getTemperature();

  String getHumidity();

  String getPrecipitation();
}