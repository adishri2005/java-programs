//4. Given two strings s and t, return true if t is an anagram of s, and false otherwise.
//Example 1:
//Input: s = "anagram", t = "nagaram"
//Output: true
//Example 2:
//Input: s = "rat", t = "car"
//Output: false


// Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
// typically using all the original letters exactly once.

// To solve this problem, we used a frequency counter to count the occurrences of each character in both strings.
// If the frequency of each character in both strings is the same, then the strings are anagrams of each other.

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class anagram
{
    // method to check if two strs are anagrams
    public static boolean isanagram(String s, String t)
    {
        if (s.length() != t.length())
        {
            return false;
        }

        Map<Character, Integer> ccm = new HashMap<>(); // ccm = character count map

        // count chars in the first str
        for (char c : s.toCharArray())
        {
            ccm.put(c, ccm.getOrDefault(c, 0) + 1);
        }

        // subtract char counts using the second str
        for (char c : t.toCharArray()) {
            if (!ccm.containsKey(c)) {
                return false;
            }
            ccm.put(c, ccm.get(c) - 1);
            if (ccm.get(c) == 0) {
                ccm.remove(c);
            }
        }

        return ccm.isEmpty();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // get the first str
        System.out.println("ANAGRAM CHECKER");
        System.out.print("Enter the first string: ");
        String s = scanner.nextLine();

        // get the second str
        System.out.print("Enter the second string: ");
        String t = scanner.nextLine();

        // check if the strs are anagrams
        boolean result = isanagram (s, t);
        System.out.println("Are the strings anagrams? " + result);

        scanner.close();
    }
}
