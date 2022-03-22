public class Animal2 extends Animal{

  private String name;

  public void printName() {
    System.out.println(name);
  }

  @Override
  public void say() {
    System.out.println("Голос из Animal2");
  }

  public static void testClassMethod() {
    System.out.println("testClassMethod in Animal.");
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}