import java.util.Arrays;

public class consprime {
    public static void main(String[] args) {
        int r1 = 1,r2 = 30,c1 = 0,a = 0,s = 0;
        int ar[] = new int[20];
        for(int i = r1;i<=r2;i++){
            int c = 0;
            for(int j=2;j<=i;j++){
                if(i % j == 0){
                    c++;
                }
            }
            if(c == 1) {
                ar[s] = i;
                ++s;
            }
        }
        System.out.println(Arrays.toString(ar));
        for(int i=0;i<ar.length;i++){
            if(ar[i] == 0) break;
            else{
                int sum = ar[i] + ar[i+1] + 1;
                for(int k = 0;k<ar.length;k++){
                    if(ar[k] == sum){
                        System.out.println(sum);
                    }
                }
            }
        }
    }
}
