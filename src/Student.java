public interface Student {

  void printName();

  interface Student9{

    default void printNames() {
      System.out.println("d");
    }
  }

}