import java.util.Scanner;
public class switch_with_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String signal = sc.nextLine();
        switch (signal){
            case "red":
                System.out.print("Stop");
                break;
            case "yellow":
                System.out.print("Wait");
                break;
            case "green":
                System.out.print("Goo");
                break;
            default:
                System.out.print("invalid color");
        }
    }
}
