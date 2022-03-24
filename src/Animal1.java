public class Animal1 extends Animal {

  private static String str3 = "Статическая переменная Animal1 ";
  private String str4 = "Нестатическая переменная Animal1 ";

  private String name;

  final static String CONSTANT_ANIMAL1 = "CONSTANT_Animal1";

  //если создать такое же поле, как в родителе, оно перекроет поле родителя при обращении к нему по имени или через this
  // String testField = "testFieldAnimal1";

  String testField1 = "testFieldAnimal1";

  public Animal1() {
    System.out.println("Конструктор Animal1 отработал");
  }

  {
    System.out.println(str4);
    System.out.println("...Нестатические переменные Animal1 проинициализированы... \n" +
        "Нестатический блок Animal1");
  }

  static {
    System.out.println(str3);
    System.out.println("...Статические переменные Animal1 проинициализированы... \n" +
        "Статический блок Animal1");
  }

  @Override
  public void printName() {
    System.out.println(name);
  }

//не скомпилируется - уровень доступа в наследниках можно только расширять
//@Override
//private void printBreed() {
// System.out.println(breed);
// }


//не скомпилируется - уровень доступа в наследниках можно только расширять
//@Override
//void printSubType() {
// System.out.println(subType);
//}

//  @Override
//  public void printField() {
//    System.out.println("Переопределили метод");
//  }

  public void printField1() {
    System.out.println("super.printField: ");
    super.printField();
    System.out.println("CONSTANT_ANIMAL: " + CONSTANT_ANIMAL + " " + "testField: " + testField);
    System.out.println("Animal.CONSTANT_ANIMAL: " + Animal.CONSTANT_ANIMAL);
    System.out.println("Animal1.CONSTANT_ANIMAL: " + Animal1.CONSTANT_ANIMAL1);
    System.out.println("CONSTANT_ANIMAL: " + CONSTANT_ANIMAL);
    System.out.println("CONSTANT_ANIMAL1: " + CONSTANT_ANIMAL1);
    System.out.println("this.testField: " + this.testField);
    System.out.println("this.testField1: " + this.testField1);
    System.out.println("this.testField: " + testField);
    System.out.println("this.testField1: " + testField1);
    System.out.println("super.testField: " + super.testField);
  }


public void printBreed1() {
 printBreed();
 System.out.println(breed);
 System.out.println(this.breed);
 System.out.println(super.breed);
 System.out.println(super.getBreed());
 }


  @Override
  protected void printSubType() {
    System.out.println(subType);
  }

  @Override
  public void say() {

    System.out.println("Голос из Animal1");
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}