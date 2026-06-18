
import java.util.Scanner;
class addition{
    public static void main(String args[]){
        int a;
        int b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the  first number:");
        a=sc.nextInt();
        System.out.print("Enter the second number:");
        b=sc.nextInt();
        System.out.println("The sum of a and b is:"+(a+b));
    }
}