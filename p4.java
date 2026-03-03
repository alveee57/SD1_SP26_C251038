import java.util.*;
import java.util.Scanner;
public class p1 {
    public static void main(String[] args) {
        System.out.println("Enter 3 Numbers: ");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        if(a>=b && a>=c)
        {
            System.out.println(a + " is the largest integer");
        }
        else if(b>=a && b>=c)
        {
            System.out.println(b + " is the largest integer");
        }
        else if(c>=a && c>=b)
        {
            System.out.println(c + " is the largest integer");
        }
        s.close();
        
    }
}
