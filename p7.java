import java.util.Scanner;
public class p7 {
    public static void main(String[] args) {
        System.out.print("Enter a number you want multiplication table of: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i<=10; i++)
        {
            System.out.println(n+" * " + i+" = "+ (n*i));
        }
        sc.close();
    }
}
