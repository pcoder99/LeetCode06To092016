PS: 
  Given two binary strings, return their sums (also a binary string)

Thought:
  res =   x ^ y ^ carry 

  public String addBinary(String a, String b) {
        if(a == null || a.isEmpty()){
            return b;
        }
        
        if(b == null || b.isEmpty()){
            return a;
        }
        
        
        int i = a.length() - 1;
        int j = b.length() - 1;
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        while(i >= 0 || j >= 0 || carry == 1){
            int x = (i >= 0 ? Character.getNumericValue(a.charAt(i--)):0);
            int y = (j >= 0 ? Character.getNumericValue(b.charAt(j--)):0);
            int res = x ^ y ^ carry;
            sb.append(res);
            carry = ((x + y + carry) >= 2) ? 1:0;
            
        }
        return sb.reverse().toString();
        
    }
