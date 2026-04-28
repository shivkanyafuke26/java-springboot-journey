public class StringAllMethods {
    public static void main(String[] args) {
        String str = "Hello, World!";
        String str2 = "hello";
        
        // 1. charAt
        char charAtExample = str.charAt(1); // 'e'
        System.out.println("charAt(1): " + charAtExample);

        // 2. compareTo
        int compareToExample = str.compareTo(str2); // Compare lexicographically
        System.out.println("compareTo(\"hello\"): " + compareToExample);

        // 3. compareToIgnoreCase
        int compareToIgnoreCaseExample = str.compareToIgnoreCase(str2); // Case-insensitive comparison
        System.out.println("compareToIgnoreCase(\"hello\"): " + compareToIgnoreCaseExample);

        // 4. concat
        String concatExample = str.concat(" Let's learn Java!"); // "Hello, World! Let's learn Java!"
        System.out.println("concat(\" Let's learn Java!\"): " + concatExample);

        // 5. contains
        boolean containsExample = str.contains("World"); // true
        System.out.println("contains(\"World\"): " + containsExample);

        // 6. endsWith
        boolean endsWithExample = str.endsWith("!"); // true
        System.out.println("endsWith(\"!\"): " + endsWithExample);

        // 7. equals
        boolean equalsExample = str.equals("Hello, World!"); // true
        System.out.println("equals(\"Hello, World!\"): " + equalsExample);

        // 8. equalsIgnoreCase
        boolean equalsIgnoreCaseExample = str.equalsIgnoreCase("hello, world!"); // true
        System.out.println("equalsIgnoreCase(\"hello, world!\"): " + equalsIgnoreCaseExample);

        // 9. indexOf
        int indexOfExample = str.indexOf('W'); // 7
        System.out.println("indexOf('W'): " + indexOfExample);

        // 10. isEmpty
        boolean isEmptyExample = str.isEmpty(); // false
        System.out.println("isEmpty(): " + isEmptyExample);

        // 11. lastIndexOf
        int lastIndexOfExample = str.lastIndexOf('o'); // 8
        System.out.println("lastIndexOf('o'): " + lastIndexOfExample);

        // 12. length
        int lengthExample = str.length(); // 13
        System.out.println("length(): " + lengthExample);

        // 13. replace
        String replaceExample = str.replace('l', 'p'); // "Heppo, Worpd!"
        System.out.println("replace('l', 'p'): " + replaceExample);

        // 14. replaceAll
        String replaceAllExample = str.replaceAll("World", "Java"); // "Hello, Java!"
        System.out.println("replaceAll(\"World\", \"Java\"): " + replaceAllExample);

        // 15. split
        String[] splitExample = str.split(", "); // ["Hello", "World!"]
        System.out.println("split(\", \"): " + String.join(", ", splitExample));

        // 16. startsWith
        boolean startsWithExample = str.startsWith("Hell"); // true
        System.out.println("startsWith(\"Hell\"): " + startsWithExample);

        // 17. substring
        String substringExample = str.substring(7); // "World!"
        System.out.println("substring(7): " + substringExample);

        // 18. toCharArray
        char[] toCharArrayExample = str.toCharArray(); // ['H', 'e', 'l', 'l', 'o', ',', ' ', 'W', 'o', 'r', 'l', 'd', '!']
        System.out.println("toCharArray(): " + new String(toCharArrayExample));

        // 19. toLowerCase
        String toLowerCaseExample = str.toLowerCase(); // "hello, world!"
        System.out.println("toLowerCase(): " + toLowerCaseExample);

        // 20. toUpperCase
        String toUpperCaseExample = str.toUpperCase(); // "HELLO, WORLD!"
        System.out.println("toUpperCase(): " + toUpperCaseExample);

        // 21. trim
        String trimExample = str.trim(); // "Hello, World!" (removes leading and trailing spaces)
        System.out.println("trim(): " + trimExample);

        // 22. valueOf (converts different types to String)
        String valueOfExample = String.valueOf(123); // "123"
        System.out.println("valueOf(123): " + valueOfExample);

        // 23. intern
        String internExample = str.intern(); // Returns the string from the string pool
        System.out.println("intern(): " + internExample);

        // 24. matches
        boolean matchesExample = str.matches(".*World.*"); // true (regex match)
        System.out.println("matches(\".*World.*\"): " + matchesExample);

        // 25. format
        String formatExample = String.format("The value of int is %d", 10); // "The value of int is 10"
        System.out.println("format(\"The value of int is %d\", 10): " + formatExample);
    }
}
