package com.zipcodewilmington.assessment1.part2;




/**
 * Created by leon on 2/16/18.
 */
public class StringUtils {

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return an array of strings, representative of each word in the sentence
     * given a string containing words delimited by spaces, representative of a sentence, return an array of strings, each element representative of a respective word in the sentence
     */
    public static String[] getWords(String sentence) {
        String[] ans = sentence.split(" ");
        return ans;
    }


    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence
     * given a string containing words delimited by spaces, representative of a sentence, return the first word of the sentence
     */
    public static String getFirstWord(String sentence) {
        String[] ans = sentence.split(" ");
        return ans[0];
    }

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence, with identical contents in reverse order
     * given a string containing words delimited by spaces, representative of a sentence, return the first word with identical contents in reverse order
     */
    public static String reverseFirstWord(String sentence) {
        String ans = getFirstWord(sentence);
        ans = reverse(ans);
        return ans;
    }

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence, with identical contents in reverse order and the first character capitalized
     * given a string containing words delimited by spaces, representative of a sentence, return the first word with identical contents in reverse order with the first character capitalized
     */
    public static String reverseFirstWordThenCamelCase(String sentence) {
        String ans = reverseFirstWord(sentence);
        ans = camelCase(ans);
        return ans;
    }


    /**
     * @param str string input from client
     * @param index the index of the character to be removed from `str`
     * @return string with identical contents, excluding the character at the specified index
     * given a string and index, return an identical string excluding the character at the specified index
     */
    public static String removeCharacterAtIndex(String str, int index) {
        String ans = "";

        for (int i = 0; i < str.length(); i++){
            if(i != index) {
                ans += str.charAt(i);
            }
        }
        return ans;
    }




    public static String reverse(String str) {
        String ans = "";
        for(int i = str.length() - 1; i >= 0; i--){
            ans += str.charAt(i);
        }
        return ans;
    }
    public static String camelCase(String str) {
        String cap = str.substring(0,1).toUpperCase() + str.substring(1);
        return cap;
    }

}
