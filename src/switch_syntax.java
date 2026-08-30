import java.util.Scanner;
public class switch_syntax {
     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.print("enter the number:");
         int day = sc.nextInt();
         switch (day){
             case 1:
                 System.out.print("Monday");
                 break;
             case 2:
                 System.out.print("tuesday");
                 break;
             case 3:
                 System.out.print("wednasday");
                 break;
             case 4:
                 System.out.print("thursday");
                 break;
             case 5:
                 System.out.print("friday");
                 break;
             case 6:
                 System.out.print("saturday");
                 break;
             case 7:
                 System.out.print("Sunday");
                 break;
             default:
                 System.out.print("invalid day");

         }
     }
}