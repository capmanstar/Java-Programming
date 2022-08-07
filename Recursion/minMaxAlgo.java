public class minMaxAlgo {
    public static void main(String[] args) {
        int[] arr = {-1,8,-3,-1,2,1,-3,4};
        System.out.println(minmax(arr));
    }

    static int minmax(int[] arr){

        return ((3*arr.length)/2 - 2);
    }
}
