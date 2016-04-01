public class Solution {
    public int[] plusOne(int[] digits) {
        int carry = 1;
        int[] arr = new int[digits.length+1];
        for(int i=digits.length-1; i>=0; i--){
            int num = digits[i];
            arr[i+1] = (num + carry)%10;
            carry = (num+carry)/10;
        }
        if(carry != 0) arr[0] = carry;
        if(arr[0] == 0){
            int[] newArr = new int[digits.length];
            for(int i = 1; i<arr.length; i++){
                newArr[i-1] = arr[i];
            }
            return newArr;
        }
        
        return arr;
    }
}
