import java.awt.*;
import java.util.Scanner;

public class Airopt {
    public static void main(String[] args) {
        char c='H';
        if(c >= 'a' && c <= 'z')
        {
            System.out.println("lowercase alph");
        }
        else if(c >= 'A' && c<='Z')
        {
            System.out.println("uppercase alph");
        }
        else if (c >='0' && c<='9')
        {
            System.out.println("numbers");
        }
        else
        {
            System.out.println("special char");
        }
    }
}
