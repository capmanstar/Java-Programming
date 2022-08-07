public class printNumbers_recursive {
    public static void main(String[] args) {

        print(1);
    }

    static void print(int n){
        if(n==5){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        //This is called as tail recursion because it is last statement to br executed.
        print(n+1);   //Recursive call for the function.
    }
}

