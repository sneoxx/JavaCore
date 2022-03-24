public class Animal3 {

  private static String str1 = "Статическая переменная1 Animal3 ";
  private static String str2 = "Статическая переменная2 Animal3 ";
  private String str3 = "Нестатическая переменная3 Animal3 ";
  private String str4 = "Нестатическая переменная4 Animal3 ";

  public Animal3() {
    System.out.println("4 Конструктор Animal3 отработал");
  }

  {
    System.out.println(str3);
    System.out.println(str4);
    System.out.println("...Нестатические переменные Animal3 проинициализированы... \n" +
        "3 Нестатический блок Animal3");
  }

  static {
    System.out.println(str1);
    System.out.println(str2);
    System.out.println("...Статические переменные Animal3 проинициализированы... \n" +
        "1 Статический блок Animal3");
  }
}