package BasicsOfJava;
import java.util.Scanner;
public class DigitCount {
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        int num;
        System.out.println("Enter a number: ");
        num = ip.nextInt();
        ip.close();
        int temp = Math.abs(num);
        int count = 0;

        while ( temp != 0){
            temp = temp % 10;
            count++;
        }

        System.out.println("Number of digits in " + num + " is : " + count);

    }
}
