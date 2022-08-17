package Intro;

public class Final {
    public static void main(String[] args) {

        final int A = 10; //final means decalring a var as constant
//        A = 20;  //can not modify once finalized.

        final Sample obj = new Sample("ABC");
        obj.str = "XYZ"; //types other than primitives can be modified if declaered final but can not reassinged.

//        obj = new Intro.Sample("Darshan");

    }
}

class Sample{
    String str;

    Sample(String str){
        this.str = str;
    }
}
