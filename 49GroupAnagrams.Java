PS:
  Given an array of strings, return group of anagrams.

  Thought: sort at which point makes it more efficient ?
Implementation:

 public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0){
            return new ArrayList<List<String>>();
        }
        
        HashMap<String, List<String>> map = new HashMap<>();
        
        for(String astr : strs){
            char[] theword = astr.toCharArray();
            Arrays.sort(theword);
            String key = String.valueOf(theword);
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<String>());
            }
            map.get(key).add(astr);
        }
        
        for(String key : map.keySet()){
            Collections.sort(map.get(key));
        }
        
        return new ArrayList<List<String>>(map.values());
        
        
        
    }
