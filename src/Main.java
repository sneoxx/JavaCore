
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;
import nestedclasses.Bicycle;

public class Main {

  public static class StudentImpl implements Student {

    private String name;
    private String surName;

    public StudentImpl(String name, String surname) {
      this.name = name;
      this.surName = surname;
    }

    @Override
    public void printName() {
      System.out.println(name);
    }

    public void printFullName() {
      System.out.println(surName + " " + name);
    }
  }

  public static class MonitoringSystemClass {

    String name;

    MonitoringSystemClass(String name) {
      this.name = name;
    }

    void startMonitoring() {
      System.out.println(name);
    }
  }

  public static class Dog extends Animal1 {

    @Override
    public void say() {
      System.out.println(this.getName() + ": Гав!");
      StudentImpl6 studentImpl61 = new StudentImpl6();
    }
  }

  public static class Cat extends Animal1 {

    @Override
    public void say() {
      System.out.println(this.getName() + ": Мяу!");
    }
  }

  public static void main(String[] args) {

    //1 ТИПЫ ДАННЫХ
    //1.1 Инициализация и преобразование примитивных типов. Арифметические операции.
    byte a = 127;
    // byte a = 300; // не скомпилируется, выход за пределы значений байт
    int a2 = 258;
    byte b2 = (byte) a2; // будет 2, переполнение типа - явное преобразование с потерей данных
    double d1 = 5.6d; // задаем double
    // long a = 3000000000; //Ошибка компиляции: 3 миллиарда слишком большое число для литерала типа int.
    // int a3 = 3000000000L; //Ошибка компиляции: у литерала тип long, а у переменной тип int. К тому же, 3 миллиарда больше, чем максимальное число типа int.
    long a3 = 3_000_000_000L; //Символы подчеркивания, чтобы проще читать
    int b4 = a;  // автоматическое преобразование от byte к int

    short c2 = 128;
    byte d2 = (byte) c2; // -128 переполнение типа - явное преобразование с потерей данных

    double e = 56.9898; // или можно e = 56.9898D, e = 56.9898d
    double e1 = 56; //56.0
    double e2 = 56D; // 56.0
    double e3 = .0;  //0.0

    int f = (int) e; // будет 56, произойдет усечение дробной части

    int g = 2147483647;
    float h = g; // будет 2.14748365E9, произойдет потеря точности

    int i = 3;
    double j = 4.6;
    double k = i + j; // т.к участвует double, преобразуются в double

    char l = 'a';
    int m = l + 5; // будет 102, числовой код char 'a’ 97 преобразуется в int

    byte n = 3;
    short o = 4;
    byte p = (byte) (n + o); // при сложении преобразуются к int, чтобы получить byte нужно явно привести к нему

    System.out.println("---------------");
    System.out.println("Специальное значение INFINITY - бесконечность");
    //1.2 Специальное значение INFINITY - бесконечность
    // 1.2.1 Бесконечное умноженное на 0, результат NaN
    System.out.println(Float.POSITIVE_INFINITY * 0); // output: NaN
    System.out.println(Float.NEGATIVE_INFINITY * 0); // output: NaN
    // 1.2.2. Бесконечное деление на 0, результат остается неизменным, или бесконечно
    System.out.println(100.0 / 0.0); // output:Infinity
    System.out.println(-100.0 / 0.0); //output: -Infinity
    System.out.println(Float.POSITIVE_INFINITY / 0); // output:Infinity
    System.out.println(Float.NEGATIVE_INFINITY / 0); // output: -Infinity
    System.out.println((Float.POSITIVE_INFINITY / 0) == Float.POSITIVE_INFINITY); // output: true
    System.out.println((Float.NEGATIVE_INFINITY / 0) == Float.NEGATIVE_INFINITY); // output: true
    // 1.2.3. Бесконечное деление на бесконечное, результат NaN.
    System.out.println(Double.POSITIVE_INFINITY / Double.POSITIVE_INFINITY);// NaN
    System.out.println(Double.POSITIVE_INFINITY / Double.NEGATIVE_INFINITY);// NaN
    System.out.println(Double.NEGATIVE_INFINITY / Double.NEGATIVE_INFINITY);// NaN
    // 1.2.4. Бесконечные операции, кроме умножения на 0 и деления на бесконечность, результат по-прежнему бесконечен.
    double c1 = b2 - 100; // c == Infinity
    System.out.println(Float.POSITIVE_INFINITY == (Float.POSITIVE_INFINITY + 10000)); // output: true
    System.out.println(Float.POSITIVE_INFINITY == (Float.POSITIVE_INFINITY - 10000)); // output: true
    System.out.println(Float.POSITIVE_INFINITY == (Float.POSITIVE_INFINITY * 10000)); // output: true
    System.out.println(Float.POSITIVE_INFINITY == (Float.POSITIVE_INFINITY / 10000)); // output: true
    System.out.println(Double.isInfinite(Float.POSITIVE_INFINITY)); //проверка на бесконечность

    System.out.println("---------------");
    System.out.println("Специальное значение NAN - не число");
    System.out.println(Double.NaN == Double.NaN);// false
    Double a5 = Double.NaN;
    Double b3 = Double.NaN;
    System.out.println(a5.equals(b3)); // true
    System.out.println(Double.NaN != Double.NaN);// true

    //1.4 Оболочки.
    // 1.4.1 Иммуитабельность Integer
    System.out.println("---------------");
    System.out.println("Классы Оболочки");
    Integer a6 = new Integer(0);
    Integer b6 = new Integer(0);

    b6 = a6; //b теперь ссылается на тот же объект, что и а (на 0)
    a6 = 1;  //a теперь ссылает на 1
    System.out.println(b6);// будет 0
    System.out.println(a6);// будет 1

    // 1.4.2 Автораспаковка, автоупаковка. Методы классов оболочек.
    int x = 2;
    Integer y = 11;
    x = y;                               // будет 11, автораспаковка
    y = x * 2;                           // 11 * 2 = 22, автоупаковка
    String str = y.toString();
    y.doubleValue(); // 22.0
    Integer.parseInt("2"); // строку к Integer
    //System.out.println(Integer.parseInt("r")); //NumberFormatException
    int maxValue = Integer.MAX_VALUE; // 2147483647
    Integer.sum(x, y);  // 22 + 11= 33

    //2 В JAVA все передается по значению
    // значение ссылки примитивного типа это само значение
    System.out.println("---------------");
    System.out.println("---------------");
    System.out.println("2 Передача ссылок по значению");
    int x1 = 2;
    int y1 = x1; //значение копируется и присваивается новой переменной
    System.out.println(x1 == y1); //true, т.к одно значение
    // теперь у нас две независимые друг от друга переменные с одинаковым значением

    // значение ссылочной переменной это ссылка на объект в куче
    Cat cat1 = new Cat();
    Cat cat2 = cat1; // Ссылка А копируется в ссылку B
    System.out.println(cat1 == cat2); //true, т.к две ссылки на один объект
    System.out.println(cat1.equals(cat2)); //true, т.к один объект
    // теперь у нас две ссылки на один объект

    //3 String
    System.out.println("---------------");
    System.out.println("---------------");
    System.out.println("3 Класс String, concat, + ");
    String str22 = "Эта строка создана при помощи литерала ";
    String str66 = new String(new char[]{' ', 'м', 'а', 'с', 'c', 'и', 'в', 'а', ' ', ' ',}, 0, 9);
    System.out.println((str22.concat("и")) + str66); // Эта строка создана при помощи литерала и масcива

    //3.1 String Poll
    System.out.println("---------------");
    System.out.println("3.1 String Poll");
    String str1 = "Hello";
    String str2 = "Hello";
    System.out.println(str1 == str2); //true

    String str3 = "Hel" + "lo";
    System.out.println(str1 == str3); //true

    String str4 = "Hel";
    String str5 = str4 + "lo";
    System.out.println(str1 == str5); //false
    // Причиной получения false является то, что автоматическое интернирование происходит не во время работы приложения (runtime),
    // а во время компиляции. А т.к значение строки str5 вычислится только в runtime,
    // и на этапе компиляции оно не известно и потому, не добавляется в пул строк.

    String str6 = new String("Hello");
    System.out.println(str1 == str6); //false

    String str7 = new String("Hello");
    System.out.println(str6 == str7); //false

    System.out.println(str1 == str6.intern());//true

    System.out.println(str1 == "Hello".intern());//true

    String str8 = (str4 + "lo").intern();
    System.out.println(str1 == str8); // true

    //3.2 Integer Poll
    System.out.println("---------------");
    System.out.println("3.2 Integer Poll");
    int x2 = 125;
    int x3 = 125;
    System.out.println(x2 == x3); // true - сравниваются примитивы, а примитивы хранят само значение

    Integer y2 = 125;
    Integer y3 = 125;
    System.out.println(y2 == y3); // true - сравниваются ссылки на пул Integer-ов - будет ссылка на один объект

    Integer y4 = 130;
    Integer y5 = 130;
    System.out.println(y4 == y5); // false - сравниваются ссылки на разные объекты с одним значением

    System.out.println(x2 == y3); //true - автораспаковка Integer и сравнение значений

    //4. Массивы
    //4.1 Инициализация. Заполнение. Перебор
    System.out.println("---------------");
    System.out.println("---------------");
    System.out.println("4 Массивы");
    int[] arr;                               //объявление массива
    arr = new int[10];                         // инициализация массива
    int[] arr1 = {6, 1, -7, 2, 0};            //объявление, инициализация и заполнение
    arr[0] = 2;                              // заполнение 1 элемента одномерного массива
    int[][] arr2 = new int[10][10];           //двумерный массив
    arr2[4][3] = 9;                           // заполнение двумерного массива
    int x4 = arr[1];                           // получение из массива 2 элемента
    int x5 = arr.length;                                 // получить длину массива
    String[] stringArr = Stream.of("E1", "E2").toArray(String[]::new); // массив с помощью стрима
    //заполнение массива случайными элементами с помощью цикла for
    for (int i1 = 0; i1 < arr.length; i1++) {
      arr[i1] = new Random().nextInt(323);
    }
    //перебор массива с выводом значений
    System.out.println("Перебор массива с с выводом значений");
    for (int i1 : arr) {
      System.out.println(i1);
    }
    System.out.println(Arrays.toString(arr));

    // попытка заполнения массива с помощью Foreach
    // Foreach для заполнения массива тоже нельзя, потому-что в итерационную переменную копируется значение из массива
    // и изменяя его мы не изменим значение в самом массиве.
    System.out.println("---------------");
    System.out.println("Попытка заполнения массива с помощью Foreach");
    String[] strArr = new String[10];
    for (String i1 : strArr) {
      i1 = "fg";
      System.out.println(i1);
    }
    System.out.println(Arrays.toString(strArr));

    //List<Integer> list = new ArrayList<>(arr);
    //ForEach нельзя использовать для заполнения массива и коллекции. Потому что нельзя одновременно идти по коллекции
    //и заполнять коллекцию(add) получим ConcurrentModificationException,
    //Ведь итератор для обхода мы получим до наших изменений. Но можно set и iterator.remove
    System.out.println("---------------");
    System.out.println("Заполнение list c помощью ForEach, set и счетчика ");
    List<Integer> list = Arrays.asList(7, 2, 4);
    int i3 = 0;
    for (Integer i2 : list) {
      // list.add(8); //UnsupportedOperationException
      list.set(i3, i2 + new Random().nextInt(323));
      System.out.println(i2);
      i3++;
    }
    System.out.println(list);

    System.out.println("---------------");
    System.out.println("Удаление list ");
    //нельзя удалять - UnsupportedOperationException
    int i4 = 0;
    for (Integer i2 : list) {
      // list.remove(i4); //UnsupportedOperationException
      // list.remove(i2); //UnsupportedOperationException: remove
      System.out.println(i2);
      i4++;
    }
    System.out.println(list);

    System.out.println("---------------");
    System.out.println("Удаление list2 ");
    List<Integer> list2 = new ArrayList<>();
    list2.add(65);
    list2.add(54);
    list2.add(23);
    int i5 = 0;
    for (Integer i1 : list2) {
      // list2.add(8);  //ConcurrentModificationException
      // list2.remove(1); //ConcurrentModificationException
      list2.set(2, new Random().nextInt(323));
      System.out.println(i1);
    }
    System.out.println(list2);

    //4. Модификатор статик
    System.out.println("---------------");
    System.out.println("4 Модификатор static ");
    String constant = Animal2.CONSTANT_ANIMAL; // доступ без создания экземпляра класса
    Animal2.testClassMethod();  // доступ без создания экземпляра класса
    Cat5.testClassMethod();
    StudentImpl6.method6();

    //5. Наследование и имплементация. Пример
    System.out.println("---------------");
    System.out.println("---------------");
    System.out.println("5 Наследование и имплементация");
    StudentImpl student1 = new StudentImpl("Ivan", "Ivanov");
    student1.printName();
    student1.printFullName();

    StudentImpl student2 = new StudentImpl("Masha", "Petrova");
    student2.printName();
    student2.printFullName();

    MyCar megaLada = new MyCar("Ваз 2110", "АИ-92", 1000);
    megaLada.refuel(); //Дозаправка АИ-92
    megaLada.drive(); //Ваз 2110 на старт!

    System.out.println("---------------");
    System.out.println("5.1 Восходящее и нисходящее преобразование ссылочных типов");
    //5.1 Восходящее и нисходящее преобразование ссылочных типов. Расширение модификаторов доступа методов.
    Object object = new Dog();            // восходящее преобразование
    Animal animal = new Dog();            // восходящее преобразование
    //String name = animal.name;          //не скомпилируется, т.к приватное поле
    animal.setName("animal");
    animal.setBreed("breed");
    animal.setSubType("subType");
    System.out.println(animal.getName()); // animal
    System.out.println(animal.breed);     //breed
    System.out.println(animal.subType);   //subType

    Animal1 animal1 = new Animal1();
    animal1.setName("animal1");
    animal1.setBreed("breed1");
    animal1.setSubType("subType1");
    System.out.println("-----");
    System.out.println("Наследование, что придет из полей?");
    System.out.println("Создан новый объект наследник - просетано имя поля + 1");
    animal1.printSubType();        // subType1
    animal1.printBreed1();         // выведет только breed1 - т.к мы создали новый объект Animal1, ссылка указывает на него
    animal1.printField();          // используется метод из родителя, хоть он и не переопределен явно, вернет проинициализированные значения родителя
    System.out.println("Получаем значения полей: ");
    animal1.printField1();        // получаем проинициализированные в самом классе значения полей и константы,

    System.out.println("-----");
    System.out.println("Ссылка перекинута на старый объект родитель");
    animal1 = (Animal1) animal;
    animal1.printSubType();             // subType
    animal1.printBreed1();              // выведет только breed - все будет приходить с указанного ссылкой объекта
    animal1.printField();               // CONSTANT_AnimaltestFieldAnimal
    System.out.println("Получаем значения полей: ");
    animal1.printField1();            // получаем значения старого объекта
    System.out.println("-----");

    Cat cat = new Cat();
    animal = cat;                      // восходящее преобразование, теперь animal ссылается на Cat
    //Cat cat = new Dog();             // не скомпилируется, нисходящего преобразования нет
    //Cat cat =(Cat) new Dog();        // не скомпилируется, Inconvertible types
    //cat = animal;                    // не скомпилируется, нисходящего преобразования нет
    cat = (Cat) animal;                // скомпилируется, но мы берем на себя ответственность за возможность cast-а
    cat.say();                         // ошибки не будет, произойдет вызов из методa say() cat,
    // т.к ссылку animal мы до этого перекинули на Cat
    Animal animal2 = new Dog();
    // cat = (Cat) animal2;               // скомпилируется, но вызовет ClassCastException
    // cat.say();                         // до сюда не дойдет
    System.out.println("-----");
    System.out.println(
        object.toString());     //Main$Dog@79b4d0f, есть только стандартные методы, т.к ссылка типа Object хоть и ссылается на Dog
    ((Dog) object).say();      // Гав!, кастим ссылку к Dog, теперь можем использовать методы Dog, и ссылается на Dog
    //((Cat) object).say();     // ClassCastException - Dog это не Cat
    ((Animal) object).say();    //Гав! Dog это Animal, и ссылается на Dog
    // ((Cat) object).say();    //ClassCastException Сat это Animal, но ссылается на Dog
    object = new Cat();         // теперь ссылка типа Animal ссылается на Cat, и использует его методы
    ((Cat) object).say();      // Мяу!
    // Выводы:
    // 1 Каждая ссылка ссылается на какой-то объект со своими значениями
    // 2 Ссылку можно перекинуть на другой объект со своими значениями, если наследование позволяет
    // 3 Если константа или поле инициализируется в самом классе
    //  - доступ к родительскому полю можно получить через super, если модификатор позволяет
    //  - если такого же поля нет в потомке, обращения к нему по имени или через this будут идти к родителю
    //  - если же есть такое же, оно перекроет родительское, но останется super для доступа к родительскому
    // 4 Методы при наследовании работают аналогично полям, но можем проверить через @Override правильность переопределения
    //   и уровень доступа метода можно только расширять в потомке
    // 5 Куда будет обращение определяет не тип ссылки, а куда она ссылается (чем проинициализирована)(к какому полю или методу будет обращение) - принадлежит экземпляру
    //   НО если метод статик, куда будет обращение определяет тип ссылки - ведь статика принадлежит классу
    // 6 Тип самой ссылки определяет доступность методов и полей по данной ссылке/
    // 7 Мы можем явно привести ссылку к нужному типу, но берем на себя ответственность, чем она проинициализирована, и не будет ли ошибки


    //5.2. Имплементации двух интерфейсов, дефолтных, статических методов
    // Ромбовидное наследование в интерфейсах
    System.out.println("---------------");
    System.out.println(
        "5.2 Реализация дефолтных, статических методов в интерфейсах. Ромбовидное наследование в интерфейсах");
    Student4.method4(); //мы можем обращаться к static методам интерфейса через имя_интерфейса.method()
    StudentImpl3 student6 = new StudentImpl3();
    StudentImpl3 student67 = new StudentImpl6();
    System.out.println("тутт");
    student6.method4(); // это вызов перекрытого статического метода
    student67.method4();
    //StudentImpl3.method7(); //не скомпилится, нельзя запустить не статику из статического контекста
    student6.method7(); // компилятор пропустит, но предупредит, что статику можно вызвать сразу у класса
    //Выводы:
    // 1 При ромбовидной имплементации default одинаковых методов
    // компилятор обязывает нас их переопределить, чтобы устранить неопределенность, какой метод использовать
    // 2 Мы обязаны определить логику обычных методов интерфейса, и не важно ромбовидные(одинаковые от двух интерфейсов) они или нет
    // в случае ромбовидности мы в одном методе определим логику обоих методов.
    // иначе мы должны сделать класс абстрактным

    System.out.println("---------------");
    System.out.println(
        "5.3 Вызов методов при наследовании, статичные и обычные методы, поля. Сокрытие полей и методов");
    StudentImpl3 studentImpl3 = new StudentImpl3();
    //StudentImpl3.method4();
    System.out.println("тут");
    // studentImpl3.method4();
    // Student4 student4 = new StudentImpl3();

    StudentImpl6 studentImpl6 = new StudentImpl6();
    System.out.println(studentImpl6.name); //будет 1 - вызов поля по типу ссылки

    StudentImpl3 studentImpl33 = new StudentImpl3();
    System.out.println(studentImpl33.name); //будет StudentImpl3 - вызов поля по типу ссылки
    studentImpl33 = new StudentImpl6();
    System.out.println(studentImpl33.name); //будет StudentImpl3 - вызов поля по типу ссылки

    studentImpl6.method();  //обычный метод, вызов метода по классу текущего объекта, обозначенного ссылкой
    studentImpl6.method1(); //обычный, но не переопределенный метод, вызов метода из родителя, по классу текущего объекта, обозначенного ссылкой
    studentImpl6.method4(); //статичный метод, вызов метода по типу ссылки

    System.out.println(((StudentImpl3)studentImpl6).name); // вызов поля по типу ссылки
    ((StudentImpl3) studentImpl6).method();  //обычный метод, вызов метода по типу экземпляра, чем инициализирована ссылка
    ((StudentImpl3) studentImpl6).method1(); //обычный, но не переопределенный метод, вызов метода из родителя, чем инициализирована ссылка
    ((StudentImpl3) studentImpl6).method4(); //статичный метод, вызов метода по типу ссылки



    //6 Вложенные классы
    //6.1 Нестатические вложенные классы(внутренние).
    System.out.println("---------------");
    System.out.println("---------------");
    System.out.println("6.Вложенные классы");
    System.out.println("---------------");
    System.out.println("6.1 Нестатические вложенные классы(внутренние)");
    Bicycle bicycle = new Bicycle("Peugeot", 120);
    Bicycle.Seat seat = bicycle.new Seat();
    seat.up();
    seat.getSeatModel();

    //6.2 Статические вложенные классы.
    System.out.println("---------------");
    System.out.println("6.2 Нестатические вложенные классы(внутренние)");
    //Можно создать сколько угодно экземпляров
    //Тут надо не путать объекты с переменными. Если переменная объявлена статической – то она существует в единственном экземпляре – это верно,
    //но статический вложенный класс больше похож на статический метод в этом плане.
    //Слово static перед объявлением класса указывает, что этот класс не хранит в себе ссылок на объекты внешнего класса, внутри которого объявлен
    for (int i1 = 1; i1 < 6; i1++) {
      Boeing737.Drawing drawing = new Boeing737.Drawing(i1);
      System.out.println(drawing);
    }

    //6.3 Локальные классы - внутренние классы, объявленные в блоке кода, обычно внутри метода.
    System.out.println("---------------");
    System.out.println("6.3 Локальные классы");
    GetLocalClass localClass = new External().getLocal("Test");
    System.out.println(localClass.getLocalStr()); // Метод getLocal() отработал //Test

    //6.4 Анонимные классы
    System.out.println("---------------");
    System.out.println("6.4 Анонимные классы");
    //Примеры реализации анонимного класса через интерфейс и через класс
    MonitoringSystemInterface monitoringSystemInterface = new MonitoringSystemInterface() {
      @Override
      public void startMonitoring() {
        System.out.println("Мониторинг из интерфейса стартовал!");
      }
    };
    //или можно заменить лямбдой
    //MonitoringSystemInterface monitoringSystemInterface = () -> System.out.println("Мониторинг из интерфейса стартовал!");
    monitoringSystemInterface.startMonitoring(); // сразу получаем возможность использовать переопределенный метод

    MonitoringSystemClass monitoringSystemClass = new MonitoringSystemClass("Мониторинг из класса стартовал!") {
      @Override
      void startMonitoring() {
        super.startMonitoring();
      }
    };
    monitoringSystemClass.startMonitoring();

    Student student = new Student() {
      @Override
      public void printName() {
        System.out.println("Ivan");
      }
    };
    student.printName();
    //или можно заменить лямбдой
    //Student2 student4 = () -> System.out.println("Ivan");

    //6.2 Последовательность загрузки
    System.out.println("---------------");
    System.out.println("---------------");
    System.out.println("Последовательность загрузки");
//  1 Статичный блок родителя
//  2 Статичный блок потомка
//  3 Блок инициализации родителя и не статичные переменные в порядке объявления
//  4 Конструктор родителя
//  5 Блок инициализации потомка и не статичные переменные в порядке объявления
//  6 Конструктор потомка
    Bird bird = new Bird();

  }

}