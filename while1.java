import java.util.Scanner;

public class while1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
       int n= sc.nextInt();
       int i=1;
       int sum=0;
       while(i<=n)
       {
           sum=sum+i;
           i++;
       }
       System.out.println("Sum is "+sum);
       int avg=sum/n;
       System.out.println("average is "+avg);
    }
}
