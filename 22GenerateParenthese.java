PS:
  Given n pair of parentheses, write a function to generate all combinations of parentheses.
  
  dynamic implementation, generate parenthese based on previous generation.
  
  how to abstract the pattern. After abstraction, it is easy to implement it
  
  f(0) = ""
  f(1) = "("f(0)")"
  f(2) = "("f(0)")" "("f(1)")"
  f(n) = "("f(0)")"f(n-1) "("f(1)")"f(n-2) ... "("f(i)")"f(n-1-i) "("f(n-1)")"
  
  f(n) is the correct solution for a n set parenthese
  
  
  
  public List<String> generateParenthesis(int n) {
        		List<List<String>> ans = new ArrayList<>();
		ans.add(Collections.singletonList(""));
		
		for(int i = 1; i <= n; i++){
			final List<String> list = new ArrayList<>();
			
			for(int j = 0; j < i; j++){
				List<String> alist = ans.get(j);
				for(final String astr: alist){
					for(final String bstr : ans.get( i - 1 - j)){
						list.add("(" + astr + ")" + bstr);
					}
				}
			}
			ans.add(list);
		}
		
		return ans.get(ans.size() - 1);
        
    }
  
  

