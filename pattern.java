public class pattern{
    public static void main(String[] args) {
        // hollow
        // int n = 10,m = n+1;
        // for(int i=0;i<n;i++,System.out.println()){
        //     for(int j=0;j<m;j++){
        //            if(i==0 || j==0 || i==n-1 || j==m-1){
        //             System.out.print("* ");
        //            }
        //            else{
        //             System.out.print("  ");
        //            }
        //     }
 
        // inverted half pryamid
        int n = 4; 
        for(int i=0;i<n;i++,System.out.println()){
            for(int j=0;j<n-i;j++){
                if(j<=n-i){
                    System.out.print(" ");
                }
                if(i<=j){
                    System.out.print("&");
                }
            }
        }
    }
}


