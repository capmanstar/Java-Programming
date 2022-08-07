public class arraySorted {
    public static void main(String[] args){
        int[] arr = {1,2,4,8,15};
        boolean ans = sorted(arr,0);
        System.out.println(ans);
    }

    static boolean sorted(int[] arr, int i){

        if(i == arr.length-1){
            return true;
        }
        return arr[i]<arr[i+1] && sorted(arr,i+1);
    }
}
