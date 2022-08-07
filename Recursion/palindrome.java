public class palindrome {
    public static void main(String[] args) {
        boolean ans = isPalindrome(111);
        System.out.println(ans);
    }

    static int palin(int n){
        int digits = (int)(Math.log10(n)) + 1;
        return checker(n, digits);
    }

    static int checker(int n, int digits) {
        if(n % 10 == n){
            return n;
        }
        int rem = n%10;
        return rem * (int)(Math.pow(10, digits-1)) + checker(n/10, digits-1);
    }

    static boolean isPalindrome(int n){
        return n == palin(n);
    }
}
