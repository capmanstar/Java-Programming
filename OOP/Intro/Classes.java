package Intro;

public class Classes {
    public static void main(String[] args) {

       student obj = new student();
//       obj.rno = 1223;
//       obj.name = "Darshan Sonawane";
//       obj.marks = 85.56f;

//        Intro.student obj1 = new Intro.student(12,"Rahul Bhuse",95.23f);
//        System.out.println(obj1.rno);
//        System.out.println(obj1.name);
//        System.out.println(obj1.marks);


        student stud = new student(45,"Om Sonawane",89.12f);

        student stud1 = new student(stud);
        System.out.println(stud1.rno);



    }


}

class student{
    int rno;
    String name;
    float marks;

    student(){
        this(13,"Darshan Sonawane",85.23f);
        //internally it is new Intro.student(13,"Darshan Sonawane",85.23f);
    }

    student(int rno, String name, float marks){
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }

    student(student other){
        this.rno = other.rno;
        this.name = other.name;
        this.marks = other.marks;
    }
}