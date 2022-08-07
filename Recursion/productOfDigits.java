public class productOfDigits {
    public static void main(String[] args) {
        int ans = prod(1234);
        System.out.println(ans);
    }

    static int prod(int n){
        if(n==1){
            return 1;
        }
        int rem = n%10;
        n = n/10;
        return rem * prod(n);
    }
}
