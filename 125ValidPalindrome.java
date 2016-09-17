PS:
  Given a string, validate it is a palindrome. considering only alphanumeric character and ignore cases
  
Thought:
  iterating from front/end to middle, O(n) solution
  how to compare smallcase/uppercase, better leverage those Java Util method
  for, while loop is different control logic
  

Implementation:


public class Solution {
    public boolean isPalindrome(String s) {
        if(s == null || s.length() == 0)
          return true;
        
        int i = 0, j = s.length() - 1;
        while( i < j ){
            char b = s.charAt(i);
            char e = s.charAt(j);
            
            if(!Character.isLetterOrDigit(b)){
                i++;
            }else if(!Character.isLetterOrDigit(e)){
                j--;
            }else{
                if(Character.toLowerCase(b)!=Character.toLowerCase(e)){
                    return false;
                }
                i++;
                j--;
            }
            
        }
        return true;
        
    }
}
