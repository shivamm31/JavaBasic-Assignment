package Ques9;

public class BOI  extends Bank{
    String bankName = "Bank of India";
    int rateOfInterest = 11;
    @Override
    public void getDetails() {
        System.out.println("Name of Bank -->> " + bankName + "\n" + "Rate of interest -->> " + rateOfInterest + "\n");
    }
}