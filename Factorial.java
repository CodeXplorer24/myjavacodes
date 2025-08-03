package BasicsOfJava;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter a number for factorial: ");
        int num = ip.nextInt();
        int f = factorial(num);
        System.out.println("Factorial of "+ num + " is : " + f);
    }
    public static int factorial(int n){
        if ( n == 0){
            return 1;
        }
        else {
            return n*factorial(n-1);
        }
    }
}
