public class House {
  public int bedroom;
  public int bathroom;
  public int kitchen;

  private House(int bedroom, int bathroom, int kitchen) {
    this.bedroom = bedroom;
    this.kitchen = kitchen;
    this.bathroom = bathroom;
  }

  @Override
  public String toString() {
    return "House [bedrooms=" + bedroom + ", bathrooms=" + bathroom + " kitchens=" + kitchen + "]";
  }

  public static class HouseBuilder {
    int bedroom;
    int bathroom;
    int kitchen;

    public HouseBuilder setBedroom(int bedroom) {
      this.bedroom = bedroom;
      return this;
    }

    public HouseBuilder setBathroom(int bathroom) {
      this.bathroom = bathroom;
      return this;
    }

    public HouseBuilder setKitchen(int kitchen) {
      this.kitchen = kitchen;
      return this;
    }

    public House build() {
      return new House(bedroom, bathroom, kitchen);
    }
  }
}