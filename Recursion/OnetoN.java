public class OnetoN {
    public static void main(String[] args) {
        func(6);
    }

    static void func(int n){
        if(n==0){
            return;
        }
        func(n-1);
        System.out.println(n);


    }
}
