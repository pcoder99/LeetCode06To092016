PS:
  Implement a basic calculator to evaluate a simple expression string. The string contains only non-negative integers, +, -, *, 
  / and white spaces. The integer division should truncate toward zero.
  
  thought:
    No algorithm is needed. Just tedious code.
    What will happen if it is out of band.
    
  Implementation:




    
public class Solution {
    public int calculate(String s) {
        if(s==null || s.length() == 0){
            return 0;
        }
        
        int num = 0;
        char sign = '+';
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if( Character.isDigit(c) ){
                num = num * 10 + Character.getNumericValue(c);
            }
            if(!Character.isDigit(c) && ' '!= c || i == s.length() - 1){
                if(sign == '+'){
                    stack.push(num);
                }
                if(sign == '*'){
                    stack.push(stack.pop() * num);
                }
                if(sign == '-'){
                    stack.push(-num);
                }
                if(sign == '/'){
                    stack.push(stack.pop() / num);
                }
                
                sign = c;
                num = 0;
            }
        }
        
        int res = 0;
        for(int i : stack){
            res += i;
        }
        
        return res;
    }
}
