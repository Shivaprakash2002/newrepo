public class paranthesis {
    public static void main(String[] args) {

        String x = "{([])}";
        String s = "";
        for(int i=0;i<x.length();i++){
            s = s + x.charAt(i);
        }
        if(s.equals(x)){
            System.out.println(s);        
        }
    }
}
