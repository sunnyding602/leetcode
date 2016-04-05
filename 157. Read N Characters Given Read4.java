//157. Read N Characters Given Read4
/* The read4 API is defined in the parent class Reader4.
      int read4(char[] buf); */

public class Solution extends Reader4 {
    /**
     * @param buf Destination buffer
     * @param n   Maximum number of characters to read
     * @return    The number of characters read
     */
    public int read(char[] buf, int n) {
        char[] buffer = new char[4];
        int idx = 0;
        while(true){
            int curr = read4(buffer);
            int currLen = Math.min(curr, n-idx);
            
            for(int i=0; i<currLen; i++){
                buf[idx + i] = buffer[i];
            }
            idx += currLen;
            
            if(currLen != 4 || idx == n) return idx;
        }
    }
}
