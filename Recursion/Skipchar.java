import java.util.ArrayList;

public class Skipchar {
    public static void main(String[] args) {
//        String str = "baccad";
//        ArrayList<Character> ch = skip(str,0,new ArrayList<>());
//        StringBuilder sb = new StringBuilder();
//        for(char i:ch){
//            sb.append(i);
//        }
//        System.out.println(sb);

//        skip1("","baccadh");

//        String str = skip2("baccadh");
//        System.out.println(str);

//        System.out.println(skipString("baccadapplegfh"));
        System.out.println(skipAppNotApple("baccadapplegfh"));
    }

    static ArrayList<Character> skip(String str, int i, ArrayList<Character> list){
        if(i==str.length()){
            return list;
        }

        if(str.charAt(i)=='a'){
            i++;
        }
        else{
            list.add(str.charAt(i));
            i++;
        }

        return skip(str,i,list);

    }


    static void skip1(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        if(ch=='a'){
            skip1(p,up.substring(1));
        }
        else{
            skip1(p+ch,up.substring(1));
        }
    }

    static String skip2(String up){
        if(up.isEmpty()){
            return "";
        }

        char ch = up.charAt(0);
        if(ch=='a'){
            return skip2(up.substring(1));
        }
        else{
            return ch+skip2(up.substring(1));
        }
    }

    static String skipString(String up){
        if(up.isEmpty()){
            return "";
        }

        if(up.startsWith("apple")){
            return skipString(up.substring(5));
        }
        else{
            return up.charAt(0)+skipString(up.substring(1));
        }
    }

    static String skipAppNotApple(String up){
        if(up.isEmpty()){
            return "";
        }

        if(up.startsWith("app") && !up.startsWith("apple")){
            return skipAppNotApple(up.substring(3));
        }
        else{
            return up.charAt(0)+skipAppNotApple(up.substring(1));
        }
    }
}
