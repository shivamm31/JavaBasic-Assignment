package Ques5;

public class Factorial {
    int fact = 1;
    public void firstFactorial(int num){
        for(int i=1; i<=num; i++){
            fact = fact * i;
        }
    }
    public static void main(String[] args){
        Factorial f1 = new Factorial();
        f1.firstFactorial(8);
        System.out.println(f1.fact);
    }
}
