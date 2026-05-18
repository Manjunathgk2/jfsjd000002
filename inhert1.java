class A   //parent
{
    public void java()
    {
        System.out.println("Java developers");
    }
}
class B extends A  //child
{
    public void react()
    {
        System.out.println("react developers");
    }
}

public class inhert1 {
    public static void main(String[] args) {
        B obj1=new B();
        obj1.java();
        obj1.react();
    }
}
