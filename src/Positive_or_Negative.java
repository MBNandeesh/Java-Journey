import java.util.Scanner;
public class Positive_or_Negative {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a nubmer:");
        int number = sc.nextInt();

        if(number==0){
            System.out.println("number is zero");
        }else if(number>0){
            System.out.println("number is positive");
        }else{
            System.out.print("number is negative");
        }

    }
}