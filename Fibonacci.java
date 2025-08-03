package BasicsOfJava;
import java.util.Arrays;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int num;
        System.out.println("Enter the number to print fibonacci series: ");
        num = ip.nextInt();
        int[] fib = new int[num];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i < num; ++i){
            fib[i] = fib[i-1] + fib[i-2];
        }
        System.out.println(Arrays.toString(fib));
    }
}
