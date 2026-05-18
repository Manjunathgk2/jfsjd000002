abstract class A1
{
  abstract void demo();
}
public class inner1 {
    public static void main(String[] args) {
      A1 obj=new A1()
      {
          public void demo()
          {
              System.out.println("java developers ");
          }
      };
       obj.demo();
    }
}
