public interface Student44 {

  void method();

  default void method1(){
    //Дефолтные методы нужны, чтобы предоставить общую логику для всех реализующих интерфейс
    //Не вынуждая каждый раз ее реализовывать
    method4();
  }

  default void method2(){ }

  private void method3(){
    //Приватные методы нужны для вынесения повторяющейся логики из дефолтных и статических методов
  }

  static void method4(){
    // Статический метод нельзя переопределить, он принадлежит интерфейсу
    // Нельзя вызвать его у объекта реализующего класс, ибо он принадлежит интерфейсу
  }

  private static void method5(){
  }

  static void method6(){
  }
}