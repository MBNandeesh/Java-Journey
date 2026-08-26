import java.util.Scanner;
public class First_scanner {
    public static void main(String[] args) {
       System.out.println("enter your age:");
       Scanner sc = new Scanner(System.in);
       int age = sc.nextInt();

       System.out.println("your age is "+ age);

       String word = sc.next();
       System.out.println("word is: "+word);


    }
}
