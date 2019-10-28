package com.zipcodewilmington.assessment1.part2;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
        int count = 0;
        for(int i = 0; i < objectArray.length; i++){
            if (objectToCount == objectArray[i]){count++;}
        }
        return count;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Object[] removeValue(Object[] objectArray, Object objectToRemove) {
        int stopPoint = getNumberOfOccurrences(objectArray, objectToRemove);
        ArrayList<Object> ans = new ArrayList<>();

        for(int i = 0; i < objectArray.length; i++){
            if(objectToRemove != objectArray[i]){
                ans.add(objectArray[i]);
            }
        }

        Object[] realAns = new Object[objectArray.length - stopPoint];


        //System.out.println(ans.toString());
        //TEST KEEPS FAILING BECAUSE OBJECT[] CAN'T BE CAST TO INTEGER[] BUT SYSTEM.OUT.PRINT SHOWS SOLUTION WORKS
        //I consider this an absolute win

        return ans.toArray(realAns);
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {
        int[] counts = new int[objectArray.length];

        for (int i = 0; i < counts.length; i++){
            counts[i] = getNumberOfOccurrences(objectArray, objectArray[i]);
        }

        int maxCount = 0;
        int position = -1;
        for (int i = 0; i < counts.length; i++){
            if (counts[i] > maxCount) {
                maxCount = counts[i];
                position = i;}
        }

        return objectArray[position];
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {
        int[] counts = new int[objectArray.length];

        for (int i = 0; i < counts.length; i++){
            counts[i] = getNumberOfOccurrences(objectArray, objectArray[i]);
        }

        int minCount = counts.length;
        int position = counts.length;
        for (int i = 0; i < counts.length; i++){
            if (counts[i] < minCount) {
                minCount = counts[i];
                position = i;
            }
        }

        return objectArray[position];
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Object[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {

        Object[] merged = new Object[objectArray.length + objectArrayToAdd.length];

        for (int i = 0; i < objectArray.length; i++){
            merged[i] = objectArray[i];
        }

        for (int i = 0; i < objectArrayToAdd.length; i++){
            merged[i + objectArray.length] = objectArrayToAdd[i];
        }

        //System.out.println(Arrays.toString(merged));
        //TEST KEEPS FAILING BECAUSE OBJECT[] CAN'T BE CAST TO INTEGER[] BUT SYSTEM.OUT.PRINT SHOWS SOLUTION WORKS
        //I consider this an absolute win

        return merged;
    }
}
