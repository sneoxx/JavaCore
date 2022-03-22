public interface Student5 {

 // void method();

  default void method2(){
    System.out.println("interface Student5 default method3()");
    method2();
  }

  private void method3(){
    System.out.println("interface Student5 private method3()");
  }

  static void method4(){
    System.out.println("interface Student5 static method4()");
  }

  private static void method5(){
    System.out.println("interface Student5 private method5()");
  }
}