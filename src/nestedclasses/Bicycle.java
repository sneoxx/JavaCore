package nestedclasses;

public class Bicycle {

  private String model;
  private int weight;

  public Bicycle(String model, int weight) {
    this.model = model;
    this.weight = weight;
  }

  public void start() {
    System.out.println("Поехали!");
  }

  public class Seat {

    public void up() {
      System.out.println("Сиденье поднято выше!");
    }

    public void getSeatModel() {
      System.out.println("Модель велосипеда:" +
          Bicycle.this.model);
    }
  }
}
