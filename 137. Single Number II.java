//o(n)
public class Solution {
    public int singleNumber(int[] nums) {
        int ones = 0;
        int twos = 0;
        for(int n : nums){
            ones = ones ^ n & ~twos;
            twos = twos ^ n & ~ones;
        }
        return ones;
    }
}
