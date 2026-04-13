public class strings {
    public static void main(String[] args){
        //In Java, a String is a sequence of characters. It is a class in the java.lang package. Strings are immutable, which means that once a String object is created, it cannot be changed. Here are some common operations you can perform with Strings in Java:
        /*  
        String Methods: 
        1. length(): Returns the length of the string.
        2. charAt(int index): Returns the character at the specified index.
        3. substring(int beginIndex, int endIndex): Returns a new string that is a substring of this string.
        4. toUpperCase(): Converts all characters in the string to uppercase.
        5. toLowerCase(): Converts all characters in the string to lowercase.
        6. trim(): Removes leading and trailing whitespace from the string.
        7. equals(Object anObject): Compares this string to the specified object.
        8. contains(CharSequence s): Returns true if this string contains the specified sequence of char values.
        9. replace(char oldChar, char newChar): Returns a new string resulting from replacing all occurrences of oldChar in this string with newChar.
        10. split(String regex): Splits this string around matches of the given regular expression.
        11. indexOf(String str): Returns the index within this string of the first occurrence of the specified substring.
        12. lastIndexOf(String str): Returns the index within this string of the last occurrence of the specified substring.
        13. startsWith(String prefix): Tests if this string starts with the specified prefix.
        14. endsWith(String suffix): Tests if this string ends with the specified suffix.
        
        String txt = "Please locate where 'locate' occurs!";
        System.out.println(txt.indexOf("locate")); // Outputs 7
        System.out.println(txt.lastIndexOf("locate")); // Outputs 21
        15. concat(String str): Concatenates the specified string to the end of this string.
        */
        String firstName = "John ";
        String lastName = "Doe";
        int age = 30;
        System.out.println(firstName.concat(lastName).concat(String.valueOf(age))); // Concatenating strings and an integer
        System.out.println("Hello, " + firstName + lastName); // Using the + operator for concatenation
        System.out.println("Length of firstName: " + firstName.length()); // Getting the length of the string
        System.out.println("Character at index 1: " + firstName.charAt(1)); // Getting the character at index 1
        System.out.println("Substring from index 0 to 4: " + firstName.substring(0, 4)); // Getting a substring
        System.out.println("Uppercase: " + firstName.toUpperCase()); // Converting to uppercase
        System.out.println("Lowercase: " + firstName.toLowerCase()); // Converting to lowercase
        System.out.println("Trimmed string: " + firstName.trim()); // Trimming whitespace       
        System.out.println("Does firstName contain 'John'? " + firstName.contains("John")); // Checking if the string contains a substring
        System.out.println("Replacing 'o' with 'a': " + firstName.replace('o', 'a')); // Replacing characters
        System.out.println("Splitting firstName: " + String.join(", ", firstName.split(" "))); // Splitting the string
        System.out.println("Index of 'o': " + firstName.indexOf('o')); // Getting the index of a character
        System.out.println("Last index of 'o': " + firstName.lastIndexOf('o')); // Getting the last index of a character
        System.out.println("Does firstName start with 'Jo'? " + firstName.startsWith("Jo")); // Checking if the string starts with a prefix
        System.out.println("Does firstName end with 'n '? " + firstName.endsWith("n ")); // Checking if the string ends with a suffix
    }
}
