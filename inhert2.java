
class dog1  //parent
{
    String name;
    String color;
    dog1(String name,String color)
    {
        this.name=name;
        this.color=color;
    }
    public void dogdetails()
    {
        System.out.println(name+" "+color);
    }
}
class babaydog extends dog1  //child
{
    String name;
    String color;
    String breed;
    int age;
    babaydog(String name,String color,String breed,int age)
    {
        super(name,color);
        this.breed=breed;
        this.age=age;            //super
    }
    public void babydogdetails()
    {
        System.out.println(breed+" "+age);
    }
}

public class inhert2 {
    public static void main(String[] args) {
        babaydog obj=new babaydog("charli","white","Lab",2);
        obj.dogdetails();
        obj.babydogdetails();
    }
}
