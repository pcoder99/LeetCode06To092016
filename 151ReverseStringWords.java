PS:
 Given an input string, reverse the string word by word
 If there are multiple spaces betwen words, reduce them to one space

Thinking:
  reverse the whole string, 
  then, reverse word by word
  this kind of idea is out of date, find a more efficient way
  Also, get familiar with those built-in functionalities
  Actualy, this idea can be applied to ReverseWordsInAStringII

public String reverseWords(String s) {
        String[] parts = s.trim().split("\\s+");
        String out = "";
        for(int i = parts.length - 1; i > 0; i--)
          out += parts[i] + " ";
        return out + parts[0];

    }


// following implementation is not practical, it could not resolve white spaces
public String reverseWords(String s){
   return new StringBuilder(s).reverse().toString();
}
