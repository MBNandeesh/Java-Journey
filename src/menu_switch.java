import java.util.Scanner;
public class menu_switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int order = sc.nextInt();
        switch (order){
            case 1:
                System.out.print("Dosa");
                break;
            case 2:
                System.out.print("panner");
                break;
            case 3:
                System.out.print("burger");
                break;
            case 4:
                System.out.print("pizza");
                break;
            default:
                System.out.print("invalid order");
        }
    }
}
