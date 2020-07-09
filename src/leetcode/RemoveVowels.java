package leetcode;

import static util.AssertionChecker.*;

// https://leetcode.com/problems/remove-vowels-from-a-string/
public class RemoveVowels {

    private static String removeVowels(String str) {
        final StringBuilder strBuilder = new StringBuilder();
        for(int i = 0; i < str.length(); i++)
            if(!isVowel(str.charAt(i)))
                strBuilder.append(str.charAt(i));
        return strBuilder.toString();
    }

    private static boolean isVowel(char c){
        // 'y' is *not* considered a vowel in this problem.
        return (c == 'a') || (c == 'e') || (c == 'i') || (c == 'o') || (c == 'u') ||
                (c == 'A') || (c == 'E') || (c == 'I') || (c == 'O') || (c == 'U');
    }

    public static void main(String[] args) {
        int testCtr = -1;
        check("Jsn", removeVowels("Jason"), errMsg(++testCtr));
        check("jsn", removeVowels("jason"), errMsg(++testCtr));
        check("Cnd Lks", removeVowels("Canada Lakes"), errMsg(++testCtr));
        check("Rpblc f Grnd", removeVowels("Republic of Granadia"), errMsg(++testCtr));
        check("", removeVowels(""), errMsg(++testCtr));
        check(" ", removeVowels(" "), errMsg(++testCtr));
        check("   m ", removeVowels("  a m "), errMsg(++testCtr));
    }


}
