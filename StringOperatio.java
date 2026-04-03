public class StringOperatio {
  public static void main(String[] args) {
    String str1 = "Java";
    System.out.println("Length of\"" + str1 + "\"\u2192" + str1.length());
    String str2 = "Hello";
    String str3 = "World";
    System.out.println("\"" + str2 + "\"+\"" + str3 + "\"\u2192" + (str2 + str3));
    System.out.println();
    System.out.println("Using Concat():" + str2.concat(str3));
    System.out.println();

    System.out.println("\"" + str1 + "\".charAt(2)\u2192" + str1.charAt(2));
    String str4 = "Programming";
    System.out.println("\"" + str4 + "\".substring(1,4)\u2192" + str4.substring(1, 4));
    String str5 = "java";
    System.out.println("\"" + str5 + "\").toUpperCase()\u2192" + str5.toUpperCase());
    String str6 = "HELLO";
    System.out.println("\"" + str6 + "\").toLowerCase()\u2192" + str5.toLowerCase());
    String str7 = "  Welcome to java   ";
    System.out.println("Before trim:\"" + str7 + "\"");
    System.out.println("After trim:\"" + str7.trim() + "\"");
    System.out.println("\"Java\".replace('a','o')\u2192" + "Java".replace('a', 'o'));
    System.out.println("\"java\".equals(\"\")\u2192" + "java".equals("java"));

    System.out.println("\"java\".equalsIgnoreCase(\"Java\")\u2192" + "java".equalsIgnoreCase("Java"));

  }

}
