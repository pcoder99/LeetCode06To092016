Problem Statement:
  find the longest substring wihtout repeated characters
  
Thinking
  j is the begining index of the longest substring

  // whenever finding a repeated character, moving the left pointer right to the same character last found
  public int longestsubstring(String s){
    if(s.length() == 0){
      return 0;
    }
    
    HashMap<Character, Integer> map = new HashMap<>();
    int max = 0;
    for(int j = 0, i = 0; i < s.length(); ++i){
      if(map.containsKey(s.charAt(i))){
        j = Math.max(j, map.get(s.charAt(i)) + 1);
      }
      map.put(s.charAt(i),i);
      max = Math.max(max, i - j + 1);
    }
    
    return max;
  }
