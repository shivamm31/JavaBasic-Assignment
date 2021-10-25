package Ques16;

public class Main {
    public static void main(String[] args) {
        try {
            Student s1 = new Student("Shivam", 1564);
            Student s2 = (Student)s1.clone();
            System.out.println("Name -->> " + s1.name + " " + "Roll Number -->> " + s1.rollNo);
            System.out.println("Name -->> " + s2.name + " " + "Roll Number -->> " + s2.rollNo);
        }
        catch (CloneNotSupportedException c) {}
    }
}
