package Ques11;

import java.util.Objects;
import java.util.Scanner;

public class CoffeeShop {
    static String order;
    static int cost;
    static int orderID;

    public void Cashier(){
        System.out.println("We are having these coffees : ");
        System.out.println("Espresso Coffee - Rs. 50 /- " + "\n" +
                "Americano Coffee - Rs. 80 /- " + "\n" +
                "Cappuccino - Rs. 120 /- " + "\n" +
                "Tea in stock - Rs. 30 /- " + "\n" +
                "Flat White - Rs. 60 /- " + "\n" +
                " Caffe Mocha - Rs. 150 /- ");
        System.out.println("Enter you order : ");
        Scanner sc = new Scanner(System.in);
        order = sc.nextLine();
        System.out.println("Please pay the total bill : ");
        cost = sc.nextInt();
    }

    public void Customer(){
        if (Objects.equals(order,"Espresso Coffee") && cost == 50){
            orderID = 1;
            System.out.println("Your token Number = " + orderID);
            System.out.println("Wait for few minutes while your order is preparing");
        }
        else if(Objects.equals(order,"Americano Coffee") && cost == 80 ){
            orderID = 2;
            System.out.println("Your token Number = " + orderID);
            System.out.println("Wait for few minutes while your order is preparing");
        }
        else if (Objects.equals(order,"Cappuccino") && cost == 120 ){
            orderID = 3;
            System.out.println("Your toke Number = " + orderID);
            System.out.println("Wait for few minutes while your order is preparing");
        }
        else if( Objects.equals(order,"Tea in Stock") && cost == 30 ){
            orderID = 4;
            System.out.println("Your token Number = "+ orderID);
            System.out.println("Wait for few minutes while your order is preparing");
        }
        else if(Objects.equals(order,"Flat White") && cost == 60){
            orderID = 5;
            System.out.println("Your token Number = " + orderID);
            System.out.println("Wait for few minutes while your order is preparing");
        }
        else if(Objects.equals(order,"Caffe Mocha") && cost == 150){
            orderID = 6;
            System.out.println("Your token Number = "+ orderID);
            System.out.println("Wait for few minutes while your order is preparing");
        }
        else
            System.out.println("You have entered the wrong choice");
    }

    public void Barista(){
        if (orderID == 1){
            System.out.println("Please collect you order : ");
            System.out.println("Order = " + order + "\n" +
                    "Total amount = "+ cost + "\n" + "Token Number = " + orderID);
        }
        else if( orderID == 2){
            System.out.println("Please collect you order : ");
            System.out.println("Order = " + order + "\n" +
                    "Total amount = "+ cost + "\n" + "Token Number = " + orderID);
        }
        else if ( orderID == 3){
            System.out.println("Please collect you order : ");
            System.out.println("Order = " + order + "\n" +
                    "Total amount = "+ cost + "\n" + "Token Number = " + orderID);
        }
        else if ( orderID == 4){
            System.out.println("Please collect you order : ");
            System.out.println("Order = " + order + "\n" +
                    "Total amount = "+ cost + "\n" + "Token Number = " + orderID);
        }
        else if ( orderID == 5){
            System.out.println("Please collect you order : ");
            System.out.println("Order = " + order + "\n" +
                    "Total amount = "+ cost + "\n" + "Token Number = " + orderID);
        }
        else if ( orderID == 6 ){
            System.out.println("Please collect you order : ");
            System.out.println("Order = " + order + "\n" +
                    "Total amount = "+ cost + "\n" + "Token Number = " + orderID);
        }
    }

    public static void main(String[] args) {
        CoffeeShop coffeeShop = new CoffeeShop();
        coffeeShop.Cashier();
        coffeeShop.Customer();
        coffeeShop.Barista();
    }
}

