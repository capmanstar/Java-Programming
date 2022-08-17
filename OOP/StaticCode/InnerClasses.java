package StaticCode;

public class InnerClasses {
    static class A{
        String name;
        A(String name){
            this.name = name;
        }
    }


    public static void main(String[] args) {
        A a = new A("darshan");
        A b = new A("om");
        System.out.println(a.name);
        System.out.println(b.name);
    }
}

//class A{
//        static String name;
//        A(String name){
//            A.name = name;
//        }
//    }
