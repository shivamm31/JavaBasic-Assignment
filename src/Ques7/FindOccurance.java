package Ques7;

public class FindOccurance {
    public static void main(String[] args) {
        String str = "HONULULU";
        char ch = 'U';
        String chStr = ch + "";
        System.out.println("Given String --> "+str + "\n" + "To find the occuarance --> " + ch);
        String AfterDeletion = str.replace(chStr,"");
        System.out.println("Total number of occurance of character --> " + AfterDeletion.length());
    }
}