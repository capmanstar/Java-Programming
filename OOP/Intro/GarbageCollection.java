package Intro;

public class GarbageCollection {

    public static void main(String[] args) {
        for (int i = 0; i < 1000000000; i++) {
            GC gc = new GC(12);
        }
    }
}

class GC{
    int val;
    GC(int val){
        this.val = val;
    }

    //this method helps to do things when obj is destryoed by the compiler.
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
}

