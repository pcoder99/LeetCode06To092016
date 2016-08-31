PS: 
 The string "paypalishiring" is written in a zigzag pattern on a given number of rows . you may want to display this pattern in 
 a fixed font for better legibility.

Thinking:
 how to control up and down is the tricky part.
 Actually, readable code is more acceptable than efficent code because it touches the problem in a right way.
 
public String convert(String s, int numRows) {
        StringBuilder[] sb = new StringBuilder[numRows];
        for(int i = 0; i < numRows; i++){
            sb[i] = new StringBuilder();
        }
        
        char[] arr = s.toCharArray();
        int len = arr.length;
        int i = 0;
        while(i < len){
            for(int idx = 0; idx < numRows && i < len; idx++){
                sb[idx].append(arr[i++]);
            }
            for(int idx = numRows - 2; idx >= 1 && i < len; idx--)
                sb[idx].append(arr[i++]);
        }
        for(int idx = 1; idx < numRows; idx++){
            sb[0].append(sb[idx].toString());
        }
        return sb[0].toString();
    }
