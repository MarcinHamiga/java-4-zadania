package mypackage.student;

public class Student{
    private String name;
    private int age, height;

    public Student(){
        name = "John Doe";
        age = 30;
        height = 180;
    }

    public Student(String name, int age, int height){
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public void PrintData(){
        System.out.printf("Name: %s\nAge: %d\nHeight: %d\n", name, age, height);
    }
}