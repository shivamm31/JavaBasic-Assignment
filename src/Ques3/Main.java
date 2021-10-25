package Ques3;

public class Main {
    public static void main(String[] args){
        String originalString = "abcdefabcdeabcdaaa";
        char removeChar = 'a';
        StringBuilder SecondString = new StringBuilder("");
        for (int i=0; i<= originalString.length()-1; i++){
            if( removeChar != originalString.charAt(i)){
                SecondString.append(originalString.charAt(i));
            }
        }
        System.out.println(SecondString);
    }
}
