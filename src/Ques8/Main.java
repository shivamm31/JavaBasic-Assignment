package Ques8;

public class Main {
    // Static Variable
    static String FirstName = "Shivam";
    static String LastName = "Roy";
    static int Age = 24;

    // Static Block

    static{
        System.out.println("Printing using static block" + "\n");
        System.out.println("First Name -->> " + FirstName +
                "\n" + "Last Name -->> " + LastName +
                "\n" + "Age -->> " + Age);
    }

    // Static Method
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Printing using static main method" + "\n");
        System.out.println( "First Name -->> " + FirstName + "\n" + "Last Name -->> " + LastName +
                "\n" + "Age -->> " + Age);
    }
}