public class Solution {
    public int numWays(int n, int k) {
        if(n==0 || k == 0){
            return 0;
        }
        
        int num[] = {k, k*k, 0};
        if(n<=2){
            return num[n-1];
        }
        for(int i=2; i<n ; i++){    
            num[2] = (k-1)*(num[0] + num[1]);
            num[0] = num[1];
            num[1] = num[2];
        }
        return num[2];
    }
}
