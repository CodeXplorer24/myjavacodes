package BasicsOfJava;
import java.util.Scanner;
public class takinginput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter a number: ");
        num = sc.nextInt();
        System.out.println("Entered number is: " + num);
    }
}
