import java.util.HashMap;

public class LongestSubstring {
    public static void main(String[] args) {
        String s = "abcabcbb";
        int length = lengthOfLongestSubstring(s);
        System.out.println("Length of longest substring without repeating characters: " + length);
    }

    public static int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> charIndexMap = new HashMap<>();
        int maxLength = 0;
        int start = 0;

        for (int end = 0; end < s.length(); end++) {
            char currentChar = s.charAt(end);

            // If the character is already in the map, move the start pointer
            if (charIndexMap.containsKey(currentChar)) {
                start = Math.max(start, charIndexMap.get(currentChar) + 1);
            }

            // Update the last seen index of the character
            charIndexMap.put(currentChar, end);
            // Calculate the length of the current substring
            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }
}
