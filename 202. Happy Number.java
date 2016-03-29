public class Solution {
    public boolean isHappy(int n) {
        Map<Integer, Integer> map = new HashMap<>();
        while(n != 1){
            n = digitSquare(n);
            if(map.containsKey(n)){
                return false;
            }else{
                map.put(n, 1);
            }
        }
        
        return true;
    }
    
    public int digitSquare(int n){
        int res = 0;
        while(n >0){
            int digit = n%10;
            res += digit*digit;
            n = n/10;
        }
        return res;
    }
}
