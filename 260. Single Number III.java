//o(n)
public class Solution {
    public int[] singleNumber(int[] nums) {
        int diff = 0;
        for(int n : nums){
            diff ^= n;
        }
        //6  0110  先取反码 1001 再加1 是补码为 1010
        //那个 single number3 异或出的结果 result 与 －result 进行& 运算 就是计算出 从低位到高位 第一个不是0的数字 这个应该算是一个数学技巧
        // Get its last set bit
        diff &= -diff;
        
        int[] res = new int[2];
        for(int n: nums){
            if((diff & n) == 0){//the bit that is not set
                res[0] ^= n;
            }else{//the bit that is set
                res[1] ^= n;
            }
        }
        return res;
    }
}
