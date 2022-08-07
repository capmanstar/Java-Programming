import java.util.ArrayList;

public class linearSearch {
    public static void main(String[] args){
        int[] arr = {1,2,4,8,8,9};
//        boolean ans = search(arr,8,0);
//        System.out.println(ans);
//        findWithList(arr,8,0);
//        System.out.println(list);
//        ArrayList<Integer> list = new ArrayList<>();
//        ArrayList<Integer> list = searchWithArrList(arr,8,0,new ArrayList<>());
//        System.out.println(searchWithArrList(arr,8,0,list));
//        System.out.println(list);

        System.out.println(searchWithArrList2(arr,8,0));
    }

    static boolean search(int[] arr, int target, int i){
        if(i==arr.length){
            return false;
        }

        return arr[i]==target || search(arr,target,i+1);
    }

    static int find(int[] arr, int target, int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==target){
            return i;
        }
        else{
            return find(arr,target,i+1);
        }
    }

    static ArrayList<Integer> list = new ArrayList<>();
    static void findWithList(int[] arr, int target, int i){
        if(i==arr.length){
            return;
        }
        if(arr[i]==target){
            list.add(i);
        }
        findWithList(arr,target,i+1);
    }

    static ArrayList<Integer> searchWithArrList(int[] arr, int target, int i, ArrayList<Integer> list){
        if(i==arr.length){
            return list;
        }
        if(arr[i]==target){
            list.add(i);
        }

        return searchWithArrList(arr,target,i+1,list);
    }

    static ArrayList<Integer> searchWithArrList2(int[] arr, int target, int i){

        ArrayList<Integer> list = new ArrayList<>();
        if(i==arr.length){
            return list;
        }
        if(arr[i]==target){
            list.add(i);
        }
        ArrayList<Integer> ansFromBelow = searchWithArrList2(arr,target,i+1);
        list.addAll(ansFromBelow);

        return list;
    }
}
