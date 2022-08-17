package StaticCode;

import org.w3c.dom.ls.LSOutput;

public class CallingSC {

    public static void main(String[] args) {
        SingletonClass obj = SingletonClass.method();
        System.out.println(obj.name);
        SingletonClass obj1 = SingletonClass.method();
        System.out.println(obj1.name);
    }

}
