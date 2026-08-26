import java.util.Scanner;
public class if_else_block {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your age:");
        int age = sc.nextInt();
        if(age>=18){
            System.out.println("you are adult");
        }else{
            System.out.println("you are Minor");
        }

    }
}