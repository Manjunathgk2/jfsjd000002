class zepto extends Thread
{
    String id;
    String pname;
    int price;
    zepto(String id,String pname,int price)
    {
        this.id=id;
        this.pname=pname;
        this.price=price;
    }
    public void run()
    {
        System.out.println("order conformed with order id from zepto "+id);
        try {
            Thread.sleep(7000);
        }catch (Exception e)
        {
            System.out.println(e);
        }
        System.out.println("order is packing from zepto");
        try {
            Thread.sleep(7000);
        }catch (Exception e)
        {
            System.out.println(e);
        }
        System.out.println("order is one the way from zepto");
        try {
            Thread.sleep(7000);
        }catch (Exception e)
        {
            System.out.println(e);
        }
        System.out.println("product details from zepto:");
        System.out.println("from zepto "+pname+" "+price);
    }

}
class instamart extends Thread
{
   String id;
   String name;
   int Quantity;
   instamart(String id,String name,int Quantity)
   {
       this.id=id;
       this.name=name;
       this.Quantity=Quantity;
   }
   public void run()
   {
       System.out.println("order conformed with order id from instamart"+id);
       try {
           Thread.sleep(7000);
       }catch (Exception e)
       {
           System.out.println(e);
       }
       System.out.println("order is packing from instamart");
       try {
           Thread.sleep(7000);
       }catch (Exception e)
       {
           System.out.println(e);
       }
       System.out.println("order is one the way from instamart");
       try {
           Thread.sleep(7000);
       }catch (Exception e)
       {
           System.out.println(e);
       }
       System.out.println("product details from instamart:");
       System.out.println("from instamart :"+name+" "+Quantity);
   }
}
class bigbasket extends Thread
{

}
class game extends Thread
{

}
public class multithread {
    public static void main(String[] args) {
       zepto z=new zepto("A123P45","apple",200);
       z.start();
        try {
            Thread.sleep(7000);
        }catch (Exception e)
        {
            System.out.println(e);
        }
       instamart i=new instamart("G78H12345" ,"Chocklet",5);
       i.start(); try {
            Thread.sleep(7000);
        }catch (Exception e)
        {
            System.out.println(e);
        }
        zepto z1=new zepto("G8945H1233","Mango",100);
        z.start();
    }
}
