PS:
  Given two integers represented as strings, return multiplication of the integers as a string.
  
  assuming: all are non-negative, the number can be arbitray large
  how to find the position of the result is the key of the problem
  
  num1[i] * num2[j] will be persiste in i + j, i + j + 1. Actually, i + j is higher position and i + j + 1 is lower postion
  
  Draw a picture of the multiplication, understand the postion of i, j, and i + j + 1
  
  
Implementation:
     public String multiply(String num1, String num2) {
        
        int m = num1.length();
        int n = num2.length();
        int[] pos = new int[m + n ];
        
        for(int i = m - 1; i >= 0; i--){
            for(int j = n - 1; j >= 0; j--){
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int p1 = i + j + 1, p2 = i + j;
                int sum = mul + pos[p1];
                pos[p1] = sum % 10;
                pos[p2] += sum / 10;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for(int p : pos){
            if(!(sb.length() == 0 && p == 0)){
                sb.append(p);
            }
        }
        
        return sb.length() == 0 ? "0": sb.toString();
        
        
        
    }
  
  
