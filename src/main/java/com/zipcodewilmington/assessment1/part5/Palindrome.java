package com.zipcodewilmington.assessment1.part5;

public class Palindrome {


    public Integer countPalindromes(String input){

        //Test all substrings length i  ( 0 <= i < input.length)

        int count = 0;

        for(int i = 1; i < input.length() + 1; i++){

            for(int j = 0; j < input.length() + 1 - i; j++){

                String testString = input.substring(j,j+i);

                //System.out.println(testString+" "+i+" "+j);

                if(isPalindromic(testString)){count++;}
            }
        }

        return count;

    }

    public static boolean isPalindromic(String array) {

        for (int h = 0; h < array.length() - 1 - h; h++){
            if(Character.valueOf(array.charAt(h)).compareTo(array.charAt(array.length()-1-h)) == 0) {}
            else return false;
        }

        return true;
    }

}
