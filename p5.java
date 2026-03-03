import java.util.Scanner;
public class p5 {
    public static void main(String[] args) {
        System.out.println("*** Calculator ***");
        System.out.println();
        System.out.println();
        System.out.println("For Addition, Press 1");
        System.out.println("For Subtraction, Press 2");
        System.out.println("For Multiplication, Press 3");
        System.out.println("For Division, Press 4");
        System.out.println();
        System.out.print("Enter your choice: ");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Enter Two Numbers: ");
                int a = sc.nextInt();
                System.out.print(" ");
                int b = sc.nextInt();
                System.out.print(a+" + "+b+ " = "+ (a+b));
                break;
        
            case 2:
                System.out.print("Enter Two Numbers: ");
                int aa = sc.nextInt();
                System.out.print(" ");
                int bb = sc.nextInt();
                System.out.print(aa+" - "+bb+ " = "+ (aa-bb));
                break;
        
            case 3:
                System.out.print("Enter Two Numbers: ");
                int c = sc.nextInt();
                System.out.print(" ");
                int d = sc.nextInt();
                System.out.print(c+" * "+d+ " = "+ (c*d));
                break;
        
            case 4:
                System.out.print("Enter Two Numbers: ");
                int cc = sc.nextInt();
                System.out.print(" ");
                int dd = sc.nextInt();
                System.out.print(cc+" / "+dd+ " = "+ (cc/dd));
                break;
        
            default:
                break;
        }
        sc.close();
    }
}
