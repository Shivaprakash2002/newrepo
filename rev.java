import java.util.Arrays;

public class rev {
    public static void main(String[] args) {
        System.out.print(nonrepeatingCharacter("zxvczbtxyzvy"));
    }
    static char nonrepeatingCharacter(String S)
    {
        //Your code here
          for(char i:S.toCharArray()){
            System.out.println("i = "+i);
            System.out.print(S.indexOf(i) + " " +S.lastIndexOf(i));
            if(S.indexOf(i)==S.lastIndexOf(i)){
                return i;
            }
        }
        return '$';
    }
}

