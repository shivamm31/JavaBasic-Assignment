package Ques22;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 9 digit number to check : ");
        int num = sc.nextInt();
        CreditCard cc = new CreditCard();
        cc.check(num);
    }
}