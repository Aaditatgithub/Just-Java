class Solution {
    public String removeDuplicates(String s) {
        StringBuilder str = new StringBuilder();
        int len = s.length();
        int ptr = 0;
        for(int i = 0; i < len; i++){
            str.append(s.charAt(i));
            int currLen = str.length();
            if(str.length() > 1 && str.charAt(currLen- 1) == str.charAt(currLen - 2)){
                str.setLength(currLen - 2);
            }
        }
        return str.toString();
    }
}