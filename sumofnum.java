package BasicsOfJava;
import java.util.Scanner;
public class sumofnum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1, num2, sum;
        System.out.println("Enter the two numbers: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        sum = num1 + num2;
        System.out.println("Sum of two numbers is: " + sum);
    }
}
