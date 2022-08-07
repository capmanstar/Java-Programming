public class fibn {
    public static void main(String[] args) {
        //int ans = fbn(4);
        //System.out.println(ans);
        //int ans = fibFormula(50);
        //System.out.println(ans);
        for(int i=0; i<50; i++){
            System.out.println(fibFormula(i));
        }
    }


    static int fibFormula(int n){
        //this equation is derived using time complexity method for linear recurrence relation.
        return (int) ((Math.pow(((1+Math.sqrt(5))/2),n) - Math.pow(((1-Math.sqrt(5))/2),n))/Math.sqrt(5));
    }
    static int fbn(int n){
        if(n < 2){
            return n;
        }
        return fbn(n-1)+fbn(n-2);  //Recursive call
    }
}
