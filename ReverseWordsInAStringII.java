PS:
  Given a string of words, reverse the string word by word.
  
Thought:
  Only single space between words. Each word is a sequence of non-space character

Implementation:

  public void reverseWords(char[] s) {
       reverse(s, 0, s.length - 1);
       
       int start = 0;
       for(int i = 0; i < s.length - 1; i++){
           if(s[i] == ' '){
             reverse(s, start, i - 1);
             start = i + 1;
           }
       }
       
       reverse(s, start, s.length - 1);
    }
    
    public void reverse(char[] s, int start, int end){
        while(start < end){
            char tmp = s[start];
            s[start] = s[end];
            s[end] = tmp;
            start++;
            end--;
        }
    }
