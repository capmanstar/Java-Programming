package Comparables;


//to compare objs of the class we implements Comparable interface with generics.

public class Students implements Comparable<Students>{

    private int roll;
    private double marks;

    //this method compares objects on the basis of the marks.
    public Students(int roll,double marks){
        this.marks = marks;
        this.roll = roll;
    }


    @Override
    public int compareTo(Students o) {
        int diff = (int)(this.marks - o.marks);
        return diff;
    }
}
