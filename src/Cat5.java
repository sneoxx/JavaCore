public class Cat5 extends Animal2{

  public int  age;
  public static String color;
  private static String color1;

  public static void testClassMethod() {
    //age = 5; // нельзя получить доступ из статичного контекста к нестатичному
    //this.age = 5; // нельзя использовать this для статичной переменной - она принадлежит классу, а this указывает на экземпляр
    color = "Red";
    System.out.println("The testClassMethod in Cat5");
  }

}
