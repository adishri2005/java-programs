// ANAGRAM CHECKER (SORTING APPROACH)

import java.util.Arrays;
import java.util.Scanner;

public class anagram2
{

    //check if two strs are anagrams using sorting
    public static boolean isAnagram(String s, String t)
    {
        if (s.length() != t.length())
        {
            return false;
        }

        // conversion strs to char arrs and sorting them
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);

        // compare sorted char arrays
        return Arrays.equals(sArray, tArray);
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        // get first str
        System.out.println("ANAGRAM CHECKER (SORTING APPROACH)");
        System.out.print("Enter the first string: ");
        String s = scanner.nextLine();

        // get the second str
        System.out.print("Enter the second string: ");
        String t = scanner.nextLine();

        // check if the strs are anagrams
        boolean result = isAnagram(s, t);
        System.out.println("Are the strings anagrams? " + result);

        scanner.close();
    }
}
