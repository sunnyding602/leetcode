public class Solution {
    public boolean isStrobogrammatic(String num) {
        Map<Character, Character> map = new HashMap<>();
        map.put('6', '9');
        map.put('9', '6');
        map.put('1', '1');
        map.put('8', '8');
        map.put('0', '0');
        
        StringBuffer sb = new StringBuffer();
        for(int i=0; i<num.length(); i++){
            char c = num.charAt(i);
            if(map.containsKey(c)){
                sb.append(map.get(c));
            }else{
               return false;
            }
            
        }
        return sb.reverse().toString().equals(num);
    }
}
