package Ques1;

public class Main {
    public static void main(String[] args){
        String str = "pop";
        for (int i=0; i<str.length()-2; i++){
            if( str.charAt(i) == 'p' && str.charAt(i+2) == 'p'){
                System.out.println("True");
            }
            else
                System.out.println("False");
        }
    }
}
