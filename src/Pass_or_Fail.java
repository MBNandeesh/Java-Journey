import java.util.Scanner;
public class Pass_or_Fail {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your marks:");
        int marks = sc .nextInt();
        if (marks>=40){
            System.out.println("Pass");
        }else{
            System.out.print("Fail");
        }
    }
}