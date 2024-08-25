class Solution {
    public int compress(char[] chars) {
        if (chars.length == 0) return 0;

        int writeIndex = 0;  // Pointer to write in chars array
        int i = 0;           // Pointer to read the chars array

        while (i < chars.length) {
            char currentChar = chars[i];
            int count = 0;

            // Count the occurrences of the current character
            while (i < chars.length && chars[i] == currentChar) {
                count++;
                i++;
            }

            // Write the character
            chars[writeIndex++] = currentChar;

            // Write the count if more than 1
            if (count > 1) {
                for (char c : Integer.toString(count).toCharArray()) {
                    chars[writeIndex++] = c;
                }
            }
        }

        return writeIndex;
    }
}
