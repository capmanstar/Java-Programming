package StaticCode;

public class StaticConcept {
    public static void main(String[] args) {

//        Human kunal = new Human("Kunal",22,15000);
//        Human rahul = new Human("Rahul",35,20000);

        //static vars and methods are class level vars hence can be used without declaring the objs.
        System.out.println(Human.population);
//        System.out.println(rahul.population);
//        System.out.println(kunal.name);
//        System.out.println(rahul.name);

    }


}

class Human{
    String name;
    int age;
    int salary;

    static int population;
    Human(String name, int age, int salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
        Human.population += 1; //independent of the class objs hence can be accessed directly using class name.
    }
}
