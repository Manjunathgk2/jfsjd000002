interface parent1
{
    void parentdemo(String color);
}
interface parent2
{
    void childdemo(float height);
}
class child implements parent1,parent2
{
    public void parentdemo(String color)
    {
       System.out.println(color);
    }
    public void childdemo(float height)
    {
        System.out.println(height);
    }
}
public class abstract1 {
    public static void main(String[] args) {
     child g=new child();
      g.parentdemo("white");
     g.childdemo(5.7f);
    } 
}
