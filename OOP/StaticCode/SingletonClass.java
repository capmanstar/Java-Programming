package StaticCode;

public class SingletonClass {

    String name;
    private SingletonClass(String name){
        this.name = name;
    }

    private static SingletonClass instance;

    public static SingletonClass method(){
        if(instance==null){
            instance = new SingletonClass("darshan");
        }

        return instance;
    }
}
