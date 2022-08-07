public class nto1 {
    public static void main(String[] args){
        System.out.println(printNto1(100));
    }

    static int printNto1(int n){
        if(n==1){
            return 1;
        }
        System.out.println(n);
        return printNto1(n-1);
    }
}
