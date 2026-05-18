class abc
{
    String name;
    int age;
   abc(String name,int age)
   {
      this.name=name;
       this.age=age;
   }
   public void java() 
   {
       System.out.println(name+" "+age);
   }
}
public class constructors1 {
    public static void main(String[] args) {
        abc obj=new abc("ajay",18);
        obj.java();
    }
}
