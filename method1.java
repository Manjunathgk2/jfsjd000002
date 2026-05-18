class mobile
{
    int battery=50;
    public void mobiledetails(String name,String color,String ram,String rom)
    {
        System.out.println(name+" "+color+" "+ram+" "+rom);
    }
    public void message()
    {
        if(battery<=20)
        {
            System.out.println("low batter please charge");
        } else if (battery >=21 && battery<=60)
        {
            System.out.println("charge is there you can use mobile");
        }
        else
        {
            System.out.println("charge is full");
        }
    }
}
public class method1 {
    public static void main(String[] args) {
        mobile m=new mobile();
        m.mobiledetails("RealMi","Black","128GB","64GB");
        m.message();
    }
}
