package mypackage.person;

public class Person{
    private int age;
    
    public Person(int initalAge){
        if (initalAge < 0){
            System.out.println("Entered inital age is not valid. Setting age to default (0)");
            this.age = 0;
        }
        else {
            this.age = initalAge;
        }
    }

    public int getAge(){
        return age;
    }

    public void yearPasses(){
        age++;
    }

    public String amIOld(){
        if (age <= 19) {
            return "Teenager";
        }
        else {
            return "Adult";
        }
    }
}