import java.util.*;
import java.util.Scanner;
public class p3 {
    public static void main(String[] args) {
        System.out.println("Enter a Number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        if(num%2==1)
        {
            System.out.println("The number is odd");
        }
        else{
            System.out.println("The Number is even");
        }
    }
}
