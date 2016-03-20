//o(n)
public class Solution {
    public boolean canPermutePalindrome(String s) {
        if(s.length()<=1) return true;
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char key = s.charAt(i);
            if(!map.containsKey(key)){
                map.put(key, 1);
            }else{
                map.put(key, (map.get(key)+1));
            }
        }
        int oddCharCnt = 0;
        for(Map.Entry<Character, Integer> entry: map.entrySet()){
            if(entry.getValue()%2 != 0){
                oddCharCnt++;    
            }
        }
        
        return oddCharCnt<=1;
    }
}
