public class MyCar extends CarClass implements VehicleInterface  {

  private String fuel; //поле

  private Integer maxSpeed;

  public MyCar (String model, String name, Integer maxSpeed){ //конструктор
    super.model = model;
    this.fuel = name;
    this.maxSpeed = maxSpeed;
  }

  public String getFuel() {   // getter
    return fuel;
  }

  public Integer getSpeed() {
    return maxSpeed;
  }

  public void setSpeed(Integer maxSpeed) { //setter
    this.maxSpeed = maxSpeed;
  }

  public void refuel(){ // метод
    System.out.println("Дозаправка " + fuel);
  }

  @Override
  public void drive(){ //переопределенный метод
    System.out.println(super.model + " на старт!");
  }
}