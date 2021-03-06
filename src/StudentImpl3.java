
public class StudentImpl3 implements Student4, Student5 {

 String name = "StudentImpl3";

  // Мы обязаны определить логику обычных методов интерфейса, и не важно ромбовидные(одинаковые от двух интерфейсов) они или нет
  // в случае ромбовидности мы в одном методе определим логику обоих методов.
  // иначе мы должны сделать класс абстрактным
  public StudentImpl3() {
    this.name = "name";
  }

  public StudentImpl3(String name) {
    this.name = name;
  }

  @Override
  public void method() {
    System.out.println("class StudentImpl3 implements Student4,Student5 method()");
    Student4.method4(); //мы можем обращаться к static методам из не статичного контекста, если позволяет модификатор доступа, интерфейса через имя_интерфейса.method()
    Student4.super.method1(); //мы можем обращаться к обычным методам, если позволяет модификатор доступа, через имя_интерфейса.super.method()
    //name ="test"; //
    //this.name = "test"; // this неявно передается во все методы кроме static, позволяя обращаться к полям конкретного(этого) экземпляра
  }

  // не одинаковые(одиночные) default методы мы не обязаны переопределять, но можем сделать это
  @Override
  public void method1() {
    this.name = "sde";
    System.out.println("class StudentImpl3 implements Student4, Student5 method1() ");
  }

 // При ромбовидной имплементации default одинаковых методов
 // компилятор обязывает нас их переопределить, чтобы устранить неопределенность, какой метод использовать
  @Override
  public void method2(){
    System.out.println("class StudentImpl3 implements Student4, Student5 method2()");
  }

  //@Override //Нельзя переопределить static метод, он принадлежит интерфейсу
  //Но мы можем перекрыть его, по тем же правилам, что и переопределение
  //теперь будет вызваться перекрытый метод
  static void method4() {
    System.out.println("class StudentImpl3 implements Student4, Student5 static method4()");
   // Student4.method4(); //можем вызвать статик метод родителя
   // Student5.method4();
  }

  //новый статик метод
  static void method6() {
    System.out.println("class StudentImpl3 implements Student4, Student5 method7()");
  }

  //новый метод
  protected void method7() {
    System.out.println("class StudentImpl3 implements Student4, Student5 method7()");
  }

  //новый метод
  void method8() {
    System.out.println("class StudentImpl3 implements Student4, Student5 method8()");
  }

}