PS:
  Given API read4, read N characters from a file
  
 public class Solution extends Reader4 {
    /**
     * @param buf Destination buffer
     * @param n   Maximum number of characters to read
     * @return    The number of characters read
     */
    public int read(char[] buf, int n) {
    int x = 0;
    boolean eof = false;
    char[] tmp = new char[4];
    while(x < n && !eof){
        int count = read4(tmp);
        
        eof = count < 4;
        
        count = Math.min(count, n - x);
        
        for(int i = 0; i < count; i++){
            buf[x++] = tmp[i];
        }
    }
    return x;
    }
}
