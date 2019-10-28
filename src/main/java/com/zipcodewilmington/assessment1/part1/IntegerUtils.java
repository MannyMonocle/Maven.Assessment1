package com.zipcodewilmington.assessment1.part1;

import java.util.ArrayList;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerUtils {


    /**
     * @param n integer value input by client
     * @return the sum of all integers between 0 and not including `n`
     */
    public static Integer getSumOfN(Integer n) {
        int sum = n * (n+1)/2;
        return sum;
    }

    /**
     * @param n integer value input by client
     * @return the product of all integers between 0 and not including `n`
     */
    public static Integer getProductOfN(Integer n) {
        int fac = 1;
        for (int i = 1; i <= n; i++){
            fac = fac * i;
        }
        return fac;
    }

    /**
     * @param val integer value input by client
     * @return integer with identical digits in the reverse order
     */
    public static Integer reverseDigits(Integer val) {

        String str = Integer.toString(val);
        String[] arrayOld = str.split("",val);
        String ans = "";

        for(int i = arrayOld.length - 1; i >= 0; i--){
            ans += arrayOld[i];
        }

        return Integer.parseInt(ans);
    }
}
