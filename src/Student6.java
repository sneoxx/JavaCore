public interface Student6 extends Student4,Student5 {

  @Override
  void method();

  @Override
  default void method1() {
    System.out.println("interface Student6 default method1()");
    System.out.println("Дефолтные методы нужны, чтобы предоставить общую логику для всех реализующих интерфейс");
    System.out.println("Не вынуждая каждый раз ее реализовывать");
    method3();
  }

  @Override
  default void method2() {
    System.out.println("interface Student6 default method2()");
  }

 // @Override - private методы не доступны
  private void method3() {
    System.out.println("interface Student6 private method3()");
    System.out.println("Приватные методы нужны для вынесения повторяющейся логики из дефолтных и статических методов");
  }

  //@Override //Нельзя переопределить static метод, он принадлежит интерфейсу
  //Конкретно этот метод никак не связан с методом с таким же названием в интерфейсе
  static void method4() {
    System.out.println("interface Student6 static method4()");
    System.out.println("Статический метод нельзя переопределить, он принадлежит интерфейсу");
  }

 // @Override
  private static void method5() {
    System.out.println("interface Student6 private static method5()");
  }

}