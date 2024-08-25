class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder stack = new StringBuilder();
        int partLength = part.length();

        for (int i = 0; i < s.length(); i++) {
            stack.append(s.charAt(i));

            // Check if the last partLength characters in stack match part
            if (stack.length() >= partLength) {
                boolean isMatch = true;
                for (int j = 0; j < partLength; j++) {
                    if (stack.charAt(stack.length() - partLength + j) != part.charAt(j)) {
                        isMatch = false;
                        break;
                    }
                }
                if (isMatch) {
                    stack.setLength(stack.length() - partLength); // Remove the matched part
                }
            }
        }
        return stack.toString();
    }
}
