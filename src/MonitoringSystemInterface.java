////public class Cat  {
////  int intst3 = 2;
////  static int intst4 = 2;
////
////  static{
////    int intst = 1;
////    int intst1 = 2;
////    class LocalClass {
////      void print(){
////        System.out.println(intst);
////        System.out.println(intst1);
////        System.out.println(intst4);
////       // System.out.println(intst3);
////      }
////    }
////
////  }
////
////  public static void testClassMethod() {
////    System.out.println("The class method" + " in Cat.");
////    final int localint = 1;
////    class LocalClass {
////      void print(){
////         System.out.println("Hello from local class");
////      }
////    }
////    LocalClass localClass = new LocalClass();
////    localClass.print();
////  }
////
////
////  public void testInstanceMethod() {
////    System.out.println("The instance method" + " in Cat.");
////  }
//
//
//
//  public static void main(String[] args) {
//    Base anon = Base.getAnonBase(10);
//    anon.f();
//
////    Cat myCat = new Cat();
////    Animal.testClassMethod();
////    Cat.testClassMethod(); // сокрытие статического метода родителя Animal
////    Animal myAnimal = myCat;
////    myAnimal.testInstanceMethod(); // переопределение метода родителя Animal
////    //System.out.println(InnerAnimal.static_pole);
////
////    Animal myAnimal1 = new Animal();
////
////    InnerAnimal innerAnimal5 = myAnimal1.getInnerAnimal();
////    innerAnimal5.iiii = 1;
////   System.out.println(innerAnimal5.iiii);
//

//  }
//}
//
//

public interface MonitoringSystemInterface {

  void startMonitoring();
}