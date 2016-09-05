PS:
  Giving a string containing just the characters ')','(',']','[','{','}', determine if the input string is valid

Thought:
  using a stack. 
  
public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            switch(c){
                case '(':
                case '[':
                case '{':
                  stack.push(c);
                  break;
                case ')':
                  if(stack.size() == 0 || stack.pop() != '(')
                    return false;
                  break;
                case ']':
                  if(stack.size() == 0 || stack.pop() != '[')
                    return false;
                  break;
                case '}':
                  if(stack.size() == 0 || stack.pop() != '{')
                    return false;
                  break;
                default:
                  return false;
                  
            }
        }
        
        return stack.isEmpty();
        
    }
}
