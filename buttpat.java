/**
 * buttpat
 */
public class buttpat {
    public static void main(String[] args) {
        int n = 5;
        // butterfly pattern
        // for(int i=1;i<=n;i++,System.out.println()){
        //     //upper
        //     for(int j=1;j<=i;j++){
        //          System.out.print("*");
        //     }
        //     int s = 2 * (n-i);
        //     for(int j=1;j<=s;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=i;j++){
        //          System.out.print("*");
        //     }
        // }
        //     //lower
        //     int i = 1;
        //     for(int j=n-1;j>=1;j--,System.out.println()){
                
        //         for(int k=j;k>=i;k--){
        //             System.out.print("*");
        //         }
                
        //         int s1 = 2 * (n-j);
        //         for(int k=1;k<=s1;k++){
        //         System.out.print(" ");
        //         }
            
        //         for(int k=j;k>=i;k--){
        //             System.out.print("*");
        //         }
        //         }

        // solid rhombus
        // for(int i=1;i<=n;i++,System.out.println())
        // {
        //     int sp = n - (i-1);
        //     for(int j=1;j<=sp;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=n;j++){
        //         System.out.print("* ");
        //     }
        // }

        // palindromic pattern
        for(int i=1;i<=n;i++,System.out.println()){

            for(int j=1;j<=n-i;j++){
                System.out.print(' ');
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
        }
        }
}
