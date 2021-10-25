package Ques20;

public class Main {
    public static void main(String[] args) {
        BirdInterface[] duck = new BirdInterface[3];
        duck[0] = new RubberDuck(7,2, Bird.DuckType.Rubber);
        duck[1] = new MallardDuck(8,2, Bird.DuckType.Mallard);
        duck[2] = new RedheadDuck(9,2, Bird.DuckType.RedHead);
        for (int i=0; i<=3; i++){
            duck[i].ShowDetail();
            System.out.println();
        }
    }
}