public class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int cnt = 0 ;
        int res = 0;
        for(int n : nums){
            if(!map.containsKey(n)){
                if(cnt < 1) {
                    res = n;
                    cnt = 1;
                }
                map.put(n, 1);
            }else{
                int mycnt = map.get(n)+1;
                if(cnt < mycnt) {
                    res = n;
                    cnt = mycnt;
                }
                map.put(n, mycnt);
            }
        }
        
        return res;
    }
}
