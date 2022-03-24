
public class StudentImpl6 extends StudentImpl3 {

  Integer name = 1; //сокрытие поля

  public StudentImpl6() {
    super.name = "Пример";
    this.name = 2;
  }

  public StudentImpl6(Integer name) {
    // super(); //обращение к конструктору по умолчанию родителя
    // super("Test"); //обращение к конструктору c аргументами родителя
    //this(); //обращение к текущему конструктору по умолчанию
    // this(1,"Тест"); //обращение к текущему конструктору с двумя аргументами
    super.name = "Пример"; //обращение к сокрытому полю родителя
    this.name = name; // обращение к текущему полю экземпляра, как видим можем использовать одинаковые имена поля и аргумента
    //Внутри конструктора this и super должны стоять выше всех других выражений, в самом начале
    // Из чего следует, что в одном конструкторе не может быть одновременно и this(), и super().
  }

  public StudentImpl6(Integer name, String value) {
    super(value); //обращение к конструктору c аргументами родителя
  }

  public void method444() {
    System.out.println(super.name);
    System.out.println(name);
  }

  @Override
  public void method() {
    System.out.println("class StudentImpl6 extends StudentImpl3 method()");
    // String name1 = name; //не скомпилируется, мы скрыли поле с типом String в родителе, теперь тип поля Integer
    String name2 = super.name; //но можем обращаться к нему через super
    // Student4.method4(); //мы можем обращаться к static методам интерфейса через имя_интерфейса.method()
    // method4(); //если не скрыть будет вызываться статичный метод родителя
  }

  //@Override //Нельзя переопределить static метод, он принадлежит классу
  //Но мы можем перекрыть его, по тем же правилам, что и переопеределение
  //теперь будет вызваться перекрытый метод
  //@Override
  protected static void method4() {
    System.out.println("class StudentImpl6 extends StudentImpl3 static method4()");
    //  Student4.method4(); //можем вызвать статик метод родителя
    //  Student5.method4();
    //super.method();// но нельзя из статики вызвать не статик, ведь super это обращение к экземпляру, которого может еще не быть
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