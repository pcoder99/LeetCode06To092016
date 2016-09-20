Given a string consisting of upper/lowr-alphabetic letter and empty space character, return the length of the last word

take a look at the for loop

public int lengthOfLastWord(String s) {
        int len = 0, i = s.length() - 1;
        for(; i >= 0 && s.charAt(i) == ' '; i--);
        for(; i >= 0 && s.charAt(i) != ' '; i--){
            len++;
        }
        
        return len;
        
    }
