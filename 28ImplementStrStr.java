PS: 
  Implement StrStr(). Return the index of the first occurrence of the needle in haystack.

Thought:
  KMP would be the best solution. The key point is returning index,  

Implementation:

public int strStr(String haystack, String needle) {
        for(int i = 0; ; i++){
            for(int j = 0; ;j++){
                if(j == needle.length()) return i;
                if(i + j == haystack.length()) return -1;
                if(needle.charAt(j) != haystack.charAt(i + j)) break;
            }
        }
        
    }
  
