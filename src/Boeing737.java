
//Dнешний класс Boeing737, который создает самолет этой модели. А у него — конструктор с одним параметром: годом выпуска (int manufactureYear).
//Также есть одна статическая переменная int maxPassengersCount — максимальное число пассажиров. Оно будет одинаковым
// у всех самолетов одной модели, так что нам достаточно одного экземпляра.
//
// Кроме того, у него есть статический внутренний класс Drawing — чертеж самолета.
//В этом классе мы можем инкапсулировать всю служебную информацию о самолете.
// В нашем примере для простоты мы ограничили ее годом выпуска, но она может содержать много другой информации.
public class Boeing737 {

  private int manufactureYear;
  private static int maxPassengersCount = 300;

  public Boeing737(int manufactureYear) {
    this.manufactureYear = manufactureYear;
  }

  //геттеры/сеттеры
  public int getManufactureYear() {
    return manufactureYear;
  }

  public static class Drawing {

    private int id;

    public Drawing(int id) {
      this.id = id;
    }

    public static int getMaxPassengersCount() {
      return maxPassengersCount;
    }

    @Override
    public String toString() {
      return "Drawing{" +
          "id=" + id +
          '}';
    }
  }
}
