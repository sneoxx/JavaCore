public abstract class Animal {

  private String name;

  String breed;

  protected String subType;

  final static String CONSTANT_ANIMAL = "CONSTANT_Animal";

  String testField = "testFieldAnimal";

  public void printName() {
    System.out.println(name);
  }

  void printBreed() {
    System.out.println(breed);
  }

  protected void printSubType() {
    System.out.println(subType);
  }

  public void printField() {
    System.out.println("class Animal printField(): ");
    System.out.println("CONSTANT_ANIMAL: " + CONSTANT_ANIMAL + " " + "testField: " + testField);
    System.out.println("this.testField: " + this.testField);

  }


  public abstract void say();

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }

  public String getBreed() {
    return breed;
  }

  public void setBreed(String breed) {
    this.breed = breed;
  }

  public String getSubType() {
    return subType;
  }

  public void setSubType(String subType) {
    this.subType = subType;
  }

}