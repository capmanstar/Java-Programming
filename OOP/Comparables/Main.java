package Comparables;

public class Main {

    public static void main(String[] args) {

        Students stud = new Students(22,85.74);
        Students stud1 = new Students(23,95.27);
        Students stud2 = new Students(24,90.45);

        if(stud.compareTo(stud1) < 0){
            System.out.println("Stud1 has more marks than stud");
        }


    }
}
