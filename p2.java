import java.util.*;
import java.util.Scanner;
public class p2 {
    public static void main(String[] args) {
        //System.out.println("Hello, World");
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = s.nextLine();
        s.close();
        System.out.print("Hello, "+name + "!");
    }
}
