import java.util.Scanner;
public class p8 {
    public static void main(String[] args) {
        System.out.print("Factorial of: ");
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long ans = 1L;
        for(int i = 2; i<=a; i++)
        {
            ans*=i;
        }
        System.out.println(a+"! = "+ans);
        sc.close();
    }
}
