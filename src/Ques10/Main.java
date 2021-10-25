package Ques10;

import java.util.Scanner;

public class Main {
    static void whileLoopTest(){
        System.out.println("Checking while loop : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        while (!str.equalsIgnoreCase("done")){
            if (str.charAt(0) == str.charAt(str.length()-1))
                System.out.println("Character are equal");
            else
                System.out.println("Character are not equal");
            str = sc.next();
        }
    }

    static void doWhileLoopTest()
    {
        System.out.println("Checking do-while : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        if(str.equalsIgnoreCase("done"))
            return;

        do{
            if(str.charAt(0 )== str.charAt(str.length()-1))
                System.out.println("Character are Equal");
            else
                System.out.println("Character are Not Equal");
            str = sc.next();
        }
        while(!str.equalsIgnoreCase("done"));

    }



    public static void main(String[] args) {
        whileLoopTest();
        doWhileLoopTest();
    }
}