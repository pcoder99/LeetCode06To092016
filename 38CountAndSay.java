PS:
  It is important to understand the problem, what is count and what is say.
  
  public String countAndSay(int n) {
        StringBuilder cur = new StringBuilder("1");
        StringBuilder prev;
        int count;
        char say;
        
        for(int i = 1; i < n; i++){
            prev = cur;
            cur = new StringBuilder();
            say = prev.charAt(0);
            count = 1;
            for(int j = 1, len = prev.length(); j < len; j++){
                if(prev.charAt(j) != say){
                    cur.append(count).append(say);
                    count = 1;
                    say = prev.charAt(j);
                }else
                    count++;
            }
            cur.append(count).append(say);
        }
        return cur.toString();
        
    }
