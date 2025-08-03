package BasicsOfJava;
import java.util.Scanner;
public class VarInput {
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);

        // However it is better to use nextInt(), nextDouble()
        System.out.println("Enter a number: ");
        int num = Integer.valueOf(ip.nextLine());

        System.out.println("Enter a double: ");
        double num2 = Double.valueOf(ip.nextLine());

        System.out.println("Enter a string: ");
        String text = ip.nextLine();

        System.out.println("Enter a boolean: ");
        boolean bool = Boolean.valueOf(ip.nextLine());

        ip.close();

        System.out.println("num : " + num);
        System.out.println("num2 : " + num2);
        System.out.println("text : " + text);
        System.out.println("bool : " + bool);
    }
}
