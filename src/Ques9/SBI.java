package Ques9;

public class SBI extends Bank{
    String bankName = "Central Bank of India";
    int rateOfInterest = 12;
    @Override
    public void getDetails() {
        System.out.println("Name of Bank -->> " + bankName + "\n" + "Rate of interest -->> " + rateOfInterest + "\n");
    }
}