import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the both values:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("sum = " + (a+b));
        System.out.println("difference = " + (a-b));
        System.out.println("product = " + (a*b));
        System.out.print("remainder = " + (a%b));


    }
}
