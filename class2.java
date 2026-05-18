class person
{
    String name="Ajay";
    int age =18;
}
class dog
{
    String name="charli";
    String color="white";
    int age=2;
}
public class class2 {
    public static void main(String[] args) {
        person obj=new person();
        person obj1=new person();
        dog obj2=new dog();
        System.out.println(obj.name +" "+obj1.age);
        System.out.println(obj2.name +" "+obj2.color+" "+obj2.age);
    }
}
