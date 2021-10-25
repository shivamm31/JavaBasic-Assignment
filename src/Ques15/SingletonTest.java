package Ques15;

public class SingletonTest {
    private static SingletonTest instance = null;

    private SingletonTest(){
        System.out.println("constructor of class SingletonTest");
    }

    public static SingletonTest getInstance()
    {
        if(instance==null)
            instance=new SingletonTest();
        return instance;
    }
}
