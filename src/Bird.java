public class Bird extends Animal3 {

  private static String str1= "Статическая переменная1 Bird ";
  private static String str2 = "Статическая переменная2 Bird ";
  private String str3 = "Нестатическая переменная3 Bird ";
  private String str4 = "Нестатическая переменная4 Bird ";

   public Bird() {
    System.out.println("6 Конструктор Bird отработал");
  }

  {
    System.out.println(str4);
    System.out.println(str3);
    System.out.println("...Нестатические переменные Bird проинициализированы... \n" +
        "5 Нестатический блок Bird");
  }

  static {
    System.out.println(str2);
    System.out.println(str1);
    System.out.println("...Статические переменные Bird проинициализированы... \n" +
        "2 Статический блок Bird");
  }


}