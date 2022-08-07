import java.util.ArrayList;

public class SubSets {
    public static void main(String[] args) {
        String str = "abc";
//        sets("",str);
        System.out.println(setsWithList("","abc"));
    }

    static void sets(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        sets(p+ch,up.substring(1));
        sets(p,up.substring(1));
    }

    static ArrayList<String> setsWithList(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> left = setsWithList(p+ch,up.substring(1));
        ArrayList<String> right = setsWithList(p,up.substring(1));

        left.addAll(right);

        return left;
    }



}
