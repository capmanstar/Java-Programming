import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
//        arr = sort(arr);
//        System.out.println(Arrays.toString(arr));
        sortInplace(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));

    }

    static int[] sort(int[] arr){
        if(arr.length == 1){
            return arr;
        }

        int m = arr.length/2;

        int[] left = sort(Arrays.copyOfRange(arr,0,m));
        int[] right = sort(Arrays.copyOfRange(arr,m,arr.length));

        return merge(left,right);
    }

    private static int[] merge(int[] first,int[] second){

        int i=0;
        int j=0;
        int k=0;

        int[] mix = new int[first.length + second.length];

        while(i<first.length && j<second.length){
            if(first[i]<second[j]){
                mix[k] = first[i];
                i++;
            }
            else{
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        while(i<first.length){
            mix[k] = first[i];
            i++;
            k++;
        }

        while(j<second.length){
            mix[k] = second[j];
            j++;
            k++;
        }

        return mix;
    }



    static void sortInplace(int[] arr, int s, int e){
        if(e-s==1){
            return;
        }

        int m = s + (e-s)/2;

        sortInplace(arr,s,m);
        sortInplace(arr,m,e);

        mergeInplace(arr,s,m,e);
    }

    static void mergeInplace(int[] arr, int start, int mid, int end){

        int i=start;
        int j=mid;
        int k=0;

        int[] mix = new int[end-start];

        while(i<mid && j<end){
            if(arr[i]< arr[j]){
                mix[k] = arr[i];
                i++;
            }
            else{
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i<mid){
            mix[k] = arr[i];
            i++;
            k++;
        }

        while(j<end){
            mix[k] = arr[j];
            j++;
            k++;
        }

        for(int l=0; l<mix.length; l++){
            arr[start+l] = mix[l];
        }
    }
}
