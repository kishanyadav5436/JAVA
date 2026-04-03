

public class Strings {
    
    // Fixed spelling: isPalindrome
    public static boolean isPalindrome(String str) {
        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static String reverse(String str) {
        StringBuilder rev = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            rev.append(str.charAt(i));
        }
        return rev.toString();
    }

    // Fixed logic: This now capitalizes the first letter of every word
    public static String toUpperCaseFirstLetter(String str) {
        StringBuilder sb = new StringBuilder("");
        
        // Capitalize the very first character
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(str.charAt(i)); // append the space
                i++; // move to the next char
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static String compressionChar(String str) {
        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if (count > 1) {
                sb.append(count.toString());
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        // Example usage of your methods
        String str = "aaabbccc";
        System.out.println("Compressed: " + compressionChar(str));
        
        String name = "kishan is a b.tech student";
        System.out.println("Title Case: " + toUpperCaseFirstLetter(name));

        StringBuilder stx = new StringBuilder();
        stx.append("kishan ");
        stx.append("is ");
        stx.append("a ");
        stx.append("B.tech ");
        stx.append("student");
        System.out.println("StringBuilder output: " + stx);
    }
}