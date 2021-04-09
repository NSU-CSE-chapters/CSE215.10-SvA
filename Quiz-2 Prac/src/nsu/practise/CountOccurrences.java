
package nsu.practise;

import java.util.*;

public class CountOccurrences {
    public static void main(String[] args) {
        char[] chars = createChar();

        System.out.println("the lowercase letters are: ");
        displayChar(chars);
//        int[] counts = new countChars(chars);
//        int[] count = new countLetters(chars);
        System.out.println();
        System.out.println();
        displayCount(chars);
    }

    private static void displayChar(char[] chars) {
        for (int i = 0; i < chars.length; i++) {
            if ((i + 1) % 20 == 0) {
                System.out.println(chars[i]);
            } else System.out.print(chars[i]+" ");
        }
    }

    public static char[] createChar() {
        char[] chars = new char[100];

        for (int i = 0; i < chars.length; i++) {

            Random random = new Random();

            char randomChar = (char) (random.nextInt(26) + 'a');

            chars[i] = randomChar;
        }
        return chars;

    }

    public static void displayCount(char[] chars){
        int[] counts  = new int[26];

        for (int i = 0; i < chars.length; i++) {
            counts[chars[i]-'a']++;
        }

        for (int i = 0; i < counts.length; i++) {
            if ((i+1)%10==0){
                System.out.println(counts[i]+" "+(char) (i+'a'));
            }else System.out.print(counts[i]+" "+(char) (i+'a')+" ");
        }
    }


}
