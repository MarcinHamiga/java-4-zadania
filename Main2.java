import mypackage.person.Person;

public class Main2{
    public static void main(String[] args){
        Person person = new Person(18);
        System.out.println("Age:" + person.getAge());
        person.yearPasses();
        System.out.println(person.amIOld());
        person.yearPasses();
        System.out.println(person.amIOld());
    }
}