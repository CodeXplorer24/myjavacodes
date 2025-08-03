package BasicsOfJava;

import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args){

        // A year is a leap year if it is divisible by 4. However,
        // if the year is divisible by 100,
        // then it is a leap year only when it is also divisible by 400.
        Scanner ip = new Scanner(System.in);
        int year;
        System.out.println("Enter a year: ");
        year = ip.nextInt();
        if(year % 400 == 0 || ( year % 4 == 0 && year % 100 != 0)){
            System.out.println(year + " is a leap year.");
        }
        else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
