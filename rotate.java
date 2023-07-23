import java.util.Arrays;

public class rotate {
    public static void main(String[] args) {
        // int a[] = {5,34,7,3,8,2,6};
        // int st[] = new int[a.length];
        // int d = 3, j = 1;
        // for(int i=0;i<a.length;i++){
        //     if(i >= d){
        //         st[i-d] = a[i];
        //         // System.out.println(i-d+"="+st[i-d]);
        //     }
        //     else{
        //         st[d+j] = a[i];
        //         // System.out.println(d+j+ "=" +st[d+j]);
        //         j++;
        //     }
        // }
        // System.out.println(Arrays.toString(st));
        int n[] = {1,3,2,4};
        int f[] = new int[n.length];
        System.out.println(Arrays.toString(n));
        for(int i=0;i<n.length-1;i++){
            for(int j=i+1;j<n.length;j++){
                if(n[i] < n[j]){
                    f[i] = n[j];
                    System.out.print(f[i]);
                    if(n[i] > n[j+1] || n[j] < n[j+1]){
                        break;
                    }
                }
            }
        }
    }
}
