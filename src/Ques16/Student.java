package Ques16;

public class Student implements Cloneable{
    String name;
    int rollNo;

    // constructor
    Student(String name, int rollNo){
        this.name = name;
        this.rollNo = rollNo;
    }
    public Object clone()throws CloneNotSupportedException{
        return super.clone();
    }
}