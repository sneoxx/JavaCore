
public class StudentImpl6 extends StudentImpl3 {


  @Override
  public void method() {
    System.out.println("class StudentImpl6 extends StudentImpl3 method()");
    Student4.method4(); //мы можем обращаться к static методам интерфейса через имя_интерфейса.method()
    method4(); //если не скрыть будет вызываться статичный метод родителя
  }

  //@Override //Нельзя переопределить static метод, он принадлежит классу
  //Но мы можем перекрыть его, по тем же правилам, что и переопеределение
  //теперь будет вызваться перекрытый метод
  //@Override
  protected static void method4() {
    System.out.println("class StudentImpl6 extends StudentImpl3 method4()");
    Student4.method4(); //можем вызвать статик метод родителя
    Student5.method4();
    //super.method();// но нельзя из статики вызвать не статик
  }

  // Нельзя переопределить static метод, он принадлежит классу
  // @Override
  // но мы можем сокрыть его используя такие же правила как при переопределении
  protected static void method6() {
    System.out.println("class StudentImpl6 extends StudentImpl3 method6()");
  }

  //можем создать метод с таким же именем, но другой сигнатурой и любыми модификаторами доступа
  //это будет абсолютно независимый метод
  private void method6(String string) {
    System.out.println("class StudentImpl6 extends StudentImpl3 method6(String string)");
  }

  @Override
  public void method7() {
    System.out.println("class StudentImpl6 extends StudentImpl3 method6()");
  }

//  // нельзя сужать уровень доступа у наследника - protected/default
//  @Override
//  void method7() {
//    System.out.println("class StudentImpl6 extends StudentImpl3 method7()");
//  }
//
//  // нельзя сужать уровень доступа у наследника - default/private
//  @Override
//  private void method8() {
//    System.out.println("class StudentImpl6 extends StudentImpl3 method8()");
//  }
}