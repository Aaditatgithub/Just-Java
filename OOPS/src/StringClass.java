public class StringClass {
    public static void main(String[] args) {
        // String creation using literal (added to string pool)
        String str1 = "Hello";
        String str2 = "Hello";

        // String creation using new keyword (not added to string pool)
        String str3 = new String("Hello");

        // Comparing strings using ==
        System.out.println("Using ==:");
        System.out.println("str1 == str2: " + (str1 == str2)); // true (both point to the same string in the pool)
        System.out.println("str1 == str3: " + (str1 == str3)); // false (str3 is a new instance)

        // Comparing strings using equals method
        System.out.println("\nUsing equals:");
        System.out.println("str1.equals(str2): " + str1.equals(str2)); // true
        System.out.println("str1.equals(str3): " + str1.equals(str3)); // true (content is the same)

        // Concatenation
        String concatenatedStr = str1 + " World!";
        System.out.println("\nConcatenation: " + concatenatedStr);

        // Substring
        String substring = concatenatedStr.substring(0, 5);
        System.out.println("Substring: " + substring);

        // Length
        int length = concatenatedStr.length();
        System.out.println("Length: " + length);

        // Uppercase and lowercase
        String uppercase = concatenatedStr.toUpperCase();
        String lowercase = concatenatedStr.toLowerCase();
        System.out.println("Uppercase: " + uppercase);
        System.out.println("Lowercase: " + lowercase);

        // String pool demonstration
        String str4 = "Hello";
        System.out.println("\nString pool demonstration:");
        System.out.println("str1 == str4: " + (str1 == str4)); // true (both point to the same string in the pool)
    }
}
