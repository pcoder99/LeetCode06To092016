PS:
  Given a string s, find the longest palindromic substring in S. You may assume the longest length of S is 1000, and there 
  exists one unqiue longest palindromic substring.

Think:
  Extending the string on each position, isn't it consuming time ? what is the time complexity ?
  
  
  
public class Solution {
    int lo = 0;
    int maxLen = 0;
    public String longestPalindrome(String s) {
        int len = s.length();
        if(len < 2){
            return s;
        }
        
        for(int i = 0; i < len - 1; i++){
            expand(s, i, i);
            expand(s, i, i + 1);
        }
        return s.substring(lo, lo + maxLen);
    }
    
    public void expand(String s, int i, int k){
        while(i >= 0 && k < s.length() && s.charAt(i) == s.charAt(k)){
            i--;
            k++;
        }
        if(maxLen < (k - i - 1)){
            maxLen = k - i - 1;
            lo = i + 1;
        }
    }
}

Coding Tips:
- in this case, how to avoid out of range error ? why the length is (k - j - 1), and it is not (k - j + 1)
