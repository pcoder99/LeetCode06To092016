PS: 
 A message containing letters "A" -> "Z" is encoded using following mapping
 A -> 1, B -> 2, C -> 3
 
 Given an encoded message containing digits, determine the total number of ways decoding it. 
i.e "12" can be decoded as "AB" or "L", total, two ways.
  123 = NumberOfWays(Ending @23) + NumberOfWays(Ending at @3)

Implementation:

  public int numDecodings(String s) {
        int n = s.length();
        if(n == 0) return 0;
        int[] memo = new int[n + 1];
        memo[n] = 1;
        memo[n - 1] = s.charAt(n - 1) != '0' ? 1 : 0 ;
        
        for(int i = n - 2; i >= 0; i--){
            if(s.charAt(i) == '0'){
                continue;
            }else{
                memo[i] = (Integer.parseInt(s.substring(i, i + 2)) <= 26) ? memo[i + 1] + memo[i + 2] : memo[i + 1];
            }
        }
        return memo[0];
        
    }
  
