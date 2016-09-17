PS:
  Given a digit string, return all possible letter combinations that the string could represent.
  
  {"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"}
  example, string "23"
  could represent ad, ae, af, bd, be,bf, cd, ce,cf
  
thought:
 do some preprocess for string covering corner cases
 how to get all possible combinations ? FIFO Queue is good way to iterate all possibilitites
 

 
public class Solution {
    public List<String> letterCombinations(String digits) {
       
    LinkedList<String> ans = new LinkedList<String>();
    if(digits == null || digits.length() ==0 )
      return ans;
    String[] mapping = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    ans.add("");
    for(int i =0; i<digits.length();i++){
        int x = Character.getNumericValue(digits.charAt(i));
        while(ans.peek().length()==i){
            String t = ans.remove();
            for(char s : mapping[x].toCharArray())
                ans.add(t+s);
        }
    }
    return ans;
    }
}
