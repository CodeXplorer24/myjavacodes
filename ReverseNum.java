package BasicsOfJava;

import java.util.Scanner;
public class ReverseNum {
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        int num;
        System.out.println("Enter a number : ");
        num = ip.nextInt();
        int temp = num;
        int count = 0;
        int revNum = 0;
        while ( num != 0){
            int rem = num % 10;
            revNum = 10*revNum + rem;
            num = num/10;
            count++;
        }
        System.out.println("Reverse of " + temp + " is: " + revNum);
        System.out.println("Number of digits in " + temp + " is: " +count);
    }
}
