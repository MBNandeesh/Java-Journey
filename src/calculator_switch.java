import java.util.Scanner;
public class calculator_switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the values of a and b:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print("enter the choice:");
        int choice = sc.nextInt();
        switch (choice){
            case 1:
                System.out.print("Addition = "+ (a+b));
                break;
            case 2:
                System.out.print("subtraction = "+ (a-b));
                break;
            case 3:
                System.out.print("multiplication = "+ (a*b));
                break;
            case 4:
                System.out.print("division = "+ (a/b));
                break;
            default:
                System.out.print("invalid choice");
        }
    }
}
