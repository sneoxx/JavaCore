
interface GetLocalClass {

  String getLocalStr();
}

public class External {

  GetLocalClass getLocal(final String str) {

    class Local implements GetLocalClass {

      public String getLocalStr() {
        return str;
      }
    }
    System.out.println("Метод getLocal() отработал.");
    return new Local();
  }

//  public static void testClassMethod() {
//    System.out.println("The class" + " method in Animal.");
//  }

//  public void testInstanceMethod() {
//    System.out.println("The instance " + " method in Animal.");
//    System.out.println(InnerAnimal.pubfsi_pole);
//  }


//  public InnerAnimal getInnerAnimal() {
//
//    return new InnerAnimal();
//  }
//
//  class InnerAnimal {
//
//    public int iiii;
//    public int erery;
//    public final static int static_pole = 55; // ERROR
//    private final static int pubfsi_pole = 22;
//    private final static int prfsi_polr = 33;
//
//    public void setIiii(int iiii) {
//      this.iiii = iiii;
//    }
//
//    public void setErery(int erery) {
//      this.erery = erery;
//    }
//  }


}