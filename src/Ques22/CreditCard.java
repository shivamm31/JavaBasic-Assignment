package Ques22;

public class CreditCard {
    static int sum = 0, count = 0, num, digit;
    void check(int num){
        int length = String.valueOf(num).length();
        if ( length == 9 ){
            while ( num > 0 ) {
                digit = digit % 10;
                sum = sum + digit;
                num = num / 10;
            }
            System.out.println("Sum of digit of card number : " + sum);
            if ( sum % 10 == 0)
                System.out.println("OKAY");
            else
                System.out.println(" NOT OKAY");
        }
        else
            System.out.println("You have exceed the digit. Try Again! ");
    }
}

