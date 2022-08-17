package Lambdafunctions;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            list.add(i);
        }

        //lambda functions are inline/single line functions.

//        list.forEach((item)-> System.out.println(item*2));

        //use of Consumer interface.

//        Consumer<Integer> fun = (item) -> System.out.println(item*2);
//        list.forEach(fun);

        Operation sum = (a,b) -> a+b;
        Operation mult = (a,b) -> a*b;
        Operation subs = (a,b) -> a-b;

        Main lb = new Main();
        System.out.println(lb.operate(12,13,sum));
        System.out.println(lb.operate(12,13,mult));
        System.out.println(lb.operate(12,13,subs));

    }

    private int operate(int a, int b, Operation op){
        return op.operation(a,b);
    }

}



interface Operation{
    int operation(int a, int b);
}
