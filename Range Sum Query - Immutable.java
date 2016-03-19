//o(n)
public class NumArray {
    
    private List<Integer> dp = new ArrayList<>();
    public NumArray(int[] nums) {
        int sum = 0;
        for(int i=0; i< nums.length; i++){
            sum += nums[i]; 
            dp.add(sum);
        }
    }

    public int sumRange(int i, int j) {
        if(i==0) return dp.get(j);
        return dp.get(j) - dp.get(i-1);
    }
}
