package Ques13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Press 1 to check availability : ");
        System.out.println("Press 2 to issue book : ");
        System.out.println("Press 3 for give feedback : ");
        System.out.println("Press 4 to exit : ");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice){
            case 1:
                LibraryManangement lm1 = new LibraryManangement();
                lm1.BookInformation();
                break;
            case 2:
                LibraryManangement lm2 = new LibraryManangement();
                lm2.Registration();
                lm2.RequestBook();
                break;
            case 3:
                LibraryManangement lm3 = new LibraryManangement();
                lm3.FeedBack();
                break;
            case 4:
                System.out.println("Thank You");
                break;
        }
    }
}
