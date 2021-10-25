package Ques17;

public class Main {
    public static void main(String[] args) {

        try{
            int[] A = new int[5];
            A[5] = 40/0;
            System.out.println(A[10]);
        }
        catch (ArithmeticException e){
            System.out.println("If arithmetic exception occur");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("If ArrayIndexOutOfBoundsException occur");
        }
        catch (Exception e){
            System.out.println("If exception is occur");
        }
        finally {
            System.out.println("Finally block executed");
        }
    }
}