PS:
  Compare two version number. Not much idea.
  
Implementation:
  public int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");
		String[] v2 = version2.split("\\.");
		
		int len = Math.max(v1.length, v2.length);
		for(int i = 0; i < len; i++){
			Integer x = i < v1.length ? Integer.parseInt(v1[i]) : 0;
			Integer y = i < v2.length ? Integer.parseInt(v2[i]) : 0;
			int comp = x.compareTo(y);
			if(comp != 0){
				return comp;
			}
		}
		
		return 0;
        
    }
