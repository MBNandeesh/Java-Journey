import java.util.Scanner;
public class Personal_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your name:");
        String name = sc.next();
        System.out.print("enter your age:");
        int age = sc.nextInt();
        System.out.print("enter your cgpa");
        double cgpa = sc.nextDouble();

        System.out.println("name is " + name);
        System.out.println("age is " + age);
        System.out.println("cgpa is " + cgpa);



    }
}
