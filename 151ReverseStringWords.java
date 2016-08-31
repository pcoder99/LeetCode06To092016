PS:
 Given an input string, reverse the string word by word

Thinking:
  reverse the whole string, 
  then, reverse word by word
  this kind of idea is out of date, find a more efficient way

public String reverseWords(String s) {
        String[] parts = s.trim().split("\\s+");
        String out = "";
        for(int i = parts.length - 1; i > 0; i--)
          out += parts[i] + " ";
        return out + parts[0];

    }
