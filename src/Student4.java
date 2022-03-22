public interface Student4 {

  void method();

  default void method1() {
    System.out.println("interface Student4 default method3()");
    System.out.println("Дефолтные методы нужны, чтобы предоставить общую логику для всех реализующих интерфейс");
    System.out.println("Не вынуждая каждый раз ее реализовывать");
    method3();
  }

  default void method2() {
    System.out.println("interface Student4 default method2()");
  }

  private void method3() {
    System.out.println("interface Student4 private method3()");
    System.out.println("Приватные методы нужны для вынесения повторяющейся логики из дефолтных и статических методов");
  }

  static void method4() {
    System.out.println("interface Student4 static method4()");
    System.out.println("Статический метод нельзя переопределить, он принадлежит интерфейсу");
    System.out.println("Но можно перекрыть его по тем же правилам, что переопределение");
    System.out.println("У экземпляра можно вызвать статик метод, но лучше сразу у класса");
  }

  private static void method5() {
    System.out.println("interface Student4 private static method5()");
  }


  //модификатор доступа у методов в интерфейсе public(неявно), также доступен private для статик и обычных методов
  //статик вообще нельзя переопределить - он принадлежит классу
  //а т.к мы можем только расширять модификатор доступа, значит public останется public, а private мы вообще не увидим

}