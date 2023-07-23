import java.util.ArrayList;
import java.util.List;

public class permutate {
    static int fact(String val){

        int c = 1,len = val.length();
        while(len > 0){
             c = c * len;
             --len;
        }
        return c;
    }
    public static void main(String[] args) {
        String S = "ABC";
        int num = fact(S);

        List<String> str = new ArrayList<String>();
        
        String s = "",st = "";
        for(int i=0;i<num;i++){
            s = S.substring(0,S.length()-1);
            st = S.charAt(S.length()-1)+s;
            if(st.equals(S)){
                st = S.charAt(S.length()-2); 
            }
            System.out.println(st);
            S = st;
            s = "";
        }

    }
}
