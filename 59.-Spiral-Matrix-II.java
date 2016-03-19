//o(n*n)
public class Solution {
    public  int[][] generateMatrix(int n) {
        if(n == 0)  return new int[0][0];
        if(n == 1)  {
            int[][] arr = new int[1][1];
             arr[0][0] = 1;
             return arr;
        }
        int[][] matrix = new int[n][n];
        int count=1;
        int left = 0;
        int right = n-1;
        int top = 0;
        int bottom = n-1;
        while(count<= n*n){
        	if(left == right && left ==bottom){
        		matrix[left][left] = count++;
        		break;
        	}
            //--------->
            for(int i=left; i<right && count<= n*n; i++){
                matrix[top][i] = count++;
            }
            
            //V
            for(int i=top; i<bottom && count<= n*n; i++){
                matrix[i][right] = count++;
            }
            
            //<-------
            for(int i=right; i>left && count<= n*n; i--){
                matrix[bottom][i] = count++;
            }
            
            //^
            for(int i=bottom; i>top && count<= n*n ; i--){
                matrix[i][left] = count++;
            }
            left++;
            right--;
            top++;
            bottom--;
        }
        return matrix;
    }
}
