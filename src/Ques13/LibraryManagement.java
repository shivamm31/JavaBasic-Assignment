package Ques13;

import java.security.PrivateKey;
import java.util.Scanner;

class LibraryManangement implements Interface {

    String name, email, address, bookName, feedBack;
    int bookID;
    long phoneNum;
    public static final int Max_Book_Issued = 5;
    public static final int Max_lending_Days = 10;

    @Override
    public void Registration() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you name : ");
        name = sc.nextLine();
        System.out.println("Enter your email address : ");
        email = sc.nextLine();
        System.out.println("Enter you Phone Number : ");
        phoneNum = sc.nextInt();
    }

    @Override
    public void RequestBook() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Book name : ");
        bookName = sc.nextLine();
        System.out.println("Enter Book ID : ");
        bookID = sc.nextInt();
        switch (bookID){
            case 1:
                System.out.println("Book issued : " + bookName + ", with Book ID : " + bookID + "\n");
                System.out.println("Return the book with in : " + Max_lending_Days + " days" +"\n");
                System.out.println("After " + Max_lending_Days + " days you will be charge Rs. 50 /- per day ");
                break;
            case 2:
                System.out.println("Book issued : " + bookName + "with Book ID : " + bookID + "\n");
                System.out.println("Return the book with in : " + Max_lending_Days + " days" +"\n");
                System.out.println("After " + Max_lending_Days + " days you will be charge Rs. 50 /- per day ");
                break;

            case 3:
                System.out.println("Book issued : " + bookName + "with Book ID : " + bookID + "\n");
                System.out.println("Return the book with in : " + Max_lending_Days + " days" +"\n");
                System.out.println("After " + Max_lending_Days + " days you will be charge Rs. 50 /- per day ");
                break;

            case 4:
                System.out.println("Book issued : " + bookName + "with Book ID : " + bookID + "\n");
                System.out.println("Return the book with in : " + Max_lending_Days + " days" +"\n");
                System.out.println("After " + Max_lending_Days + " days you will be charge Rs. 50 /- per day ");
                break;

            case 5:
                System.out.println("Book issued : " + bookName + "with Book ID : " + bookID + "\n");
                System.out.println("Return the book with in : " + Max_lending_Days + " days" +"\n");
                System.out.println("After " + Max_lending_Days + " days you will be charge Rs. 50 /- per day ");
                break;

            case 6:
                System.out.println("Book issued : " + bookName + "with Book ID : " + bookID + "\n");
                System.out.println("Return the book with in : " + Max_lending_Days + " days" +"\n");
                System.out.println("After " + Max_lending_Days + " days you will be charge Rs. 50 /- per day ");
                break;

            case 7:
                System.out.println("Book issued : " + bookName + "with Book ID : " + bookID + "\n");
                System.out.println("Return the book with in : " + Max_lending_Days + " days" +"\n");
                System.out.println("After " + Max_lending_Days + " days you will be charge Rs. 50 /- per day ");
                break;

            case 8:
                System.out.println("Book issued : " + bookName + "with Book ID : " + bookID + "\n");
                System.out.println("Return the book with in : " + Max_lending_Days + " days" +"\n");
                System.out.println("After " + Max_lending_Days + " days you will be charge Rs. 50 /- per day ");
                break;

            case 9:
                System.out.println("Book issued : " + bookName + "with Book ID : " + bookID + "\n");
                System.out.println("Return the book with in : " + Max_lending_Days + " days" +"\n");
                System.out.println("After " + Max_lending_Days + " days you will be charge Rs. 50 /- per day ");
                break;

            case 10:
                System.out.println("Book issued : " + bookName + "with Book ID : " + bookID + "\n");
                System.out.println("Return the book with in : " + Max_lending_Days + " days" +"\n");
                System.out.println("After " + Max_lending_Days + " days you will be charge Rs. 50 /- per day ");
                break;

            case 11:
                System.out.println("Book issued : " + bookName + "with Book ID : " + bookID + "\n");
                System.out.println("Return the book with in : " + Max_lending_Days + " days" +"\n");
                System.out.println("After " + Max_lending_Days + " days you will be charge Rs. 50 /- per day ");
                break;

            case 12:
                System.out.println("Book issued : " + bookName + "with Book ID : " + bookID + "\n");
                System.out.println("Return the book with in : " + Max_lending_Days + " days" +"\n");
                System.out.println("After " + Max_lending_Days + " days you will be charge Rs. 50 /- per day ");
                break;

            case 13:
                System.out.println("Book issued : " + bookName + "with Book ID : " + bookID + "\n");
                System.out.println("Return the book with in : " + Max_lending_Days + " days" +"\n");
                System.out.println("After " + Max_lending_Days + " days you will be charge Rs. 50 /- per day ");
                break;

            case 14:
                System.out.println("Book issued : " + bookName + "with Book ID : " + bookID + "\n");
                System.out.println("Return the book with in : " + Max_lending_Days + " days" +"\n");
                System.out.println("After " + Max_lending_Days + " days you will be charge Rs. 50 /- per day ");
                break;
        }
    }

    @Override
    public void FeedBack() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please give feedback : ");
        feedBack = sc.next();
        if ( feedBack != null)
            System.out.println("THANK YOU");
        else
            System.out.println("Please give your valuable feedback. ");
    }

    @Override
    public void BookInformation() {
        System.out.println("Maximum book can be issued : " + Max_Book_Issued);
        System.out.println("Total number of books are : ");
        System.out.println(" PORTNOY’S COMPLAINT - Book ID --> 1 ");
        System.out.println(" The Great Gatsby - Book ID --> 2 ");
        System.out.println(" Don Quixote - Book ID --> 3 ");
        System.out.println(" One Hundred Years of Solitude - Book ID --> 4 ");
        System.out.println(" Invisible Man - Book ID --> 5 ");
        System.out.println(" One Night at Call Center - Book ID --> 6 ");
        System.out.println(" War and Peace - Book ID --> 7 ");
        System.out.println(" Hamlet by William Shakespeare - Book ID --> 8 ");
        System.out.println(" The Color Purple - Book ID --> 9 ");
        System.out.println(" Madame Bovary - Book ID --> 10 ");
        System.out.println(" The Divine Comedy - Book ID --> 11 ");
        System.out.println(" Lolita - Book ID --> 112 ");
        System.out.println(" The Brothers Karamazov - Book ID --> 13 ");
        System.out.println(" Crime and Punishment - Book ID --> 14 ");

    }
}
