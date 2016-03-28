//o(n)
public class Solution {
    public boolean wordPattern(String pattern, String str) {
        Map<Character, String> map = new HashMap<>();
        Map<String, Character> map2 = new HashMap<>();
        String[] arr = str.split(" ");
        if(arr.length != pattern.length()) return false;
        for(int i=0; i< arr.length; i++){
            char key = pattern.charAt(i);
            String value = arr[i];
            map.put(key, value);
            map2.put(value, key);
        }
    
        if(map.size() != map2.size()) return false;
        for(int i=0; i< pattern.length(); i++){
            String strInMap = map.get(pattern.charAt(i));
            if( false == arr[i].equals(strInMap)  ) return false;
        }
        
        return true;
    }
}
