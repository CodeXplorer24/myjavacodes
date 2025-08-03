package BasicsOfJava;
import java.util.Scanner;
public class Occurrences {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter a number and target:  ");
        int num = ip.nextInt();
        int target = ip.nextInt();
        printOccurrences(num, target);
    }
    public static void printOccurrences(int n, int target){
        int count = 0;
        int temp = n;
        while (n != 0){
            int rem = n % 10;
            if ( rem == target){
                count++;
            }
            n = n/10;
        }
        System.out.println("Occurrences of "+ target + " in " + temp + " is: " + count);
    }
}
