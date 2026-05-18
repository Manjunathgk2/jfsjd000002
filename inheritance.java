class product
{
    String name;
    double price;
    product(String name,double price)
    {
        this.name=name;
        this.price=price;
    }
    public double baseprice()
    {
        return price;
    }
}
class electronics extends product
{
    electronics(String name,double price)
    {
        super(name,price);
    }
    public double finalprice1()
    {
        return price*0.1;
    }
}
class  Grocery extends product
{
    Grocery(String name,double price)
    {
        super(name,price);
    }
    public double finalprice1()
    {
        return price*0.15;
    }
}
class fashion extends product
{
    fashion(String name,double price)
    {
        super(name,price);
    }
    public double finalprice1()
    {
        return price*0.2;
    }
}
public class inheritance {
    public static void main(String[] args) {
     electronics e=new electronics("mobile",25000);
     System.out.println("original price is "+e.baseprice() +"discount "+e.finalprice1());
    }
}