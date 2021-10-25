package Ques9;

public class ICICI extends Bank{
    String bankName = "ICICI Bank";
    int rateOfInterest = 12;
    @Override
    public void getDetails() {
        System.out.println("Name of Bank -->> " + bankName + "\n" + "Rate of interest -->> " + rateOfInterest + "\n");
    }
}