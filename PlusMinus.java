/*


Program1. WAP Given an array of integers, calculate the ratios of its elements that are positive, negative, and zero. Print the decimal value of each fraction on a new line with places after the decimal.
Sample Input
STDIN           Function
-----           --------
6               arr[] size n = 6
-4 3 -9 0 4 1   arr = [-4, 3, -9, 0, 4, 1]
Sample Output
0.500000
0.333333
0.166667


*/
package com.hackerrank.problem.java;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        Float ratioValue = 1f;    
        Float ratioOfNegNum = 0f;
        Float ratioOfPosNum = 0f;
        Float ratioOfZeroNum = 0f;
    
        ratioValue = ratioValue/arr.size(); 
        
        for (Integer value : arr) {
            if(value < 0) {
                ratioOfNegNum = ratioOfNegNum + ratioValue;
            } else if (value > 0) {
                ratioOfPosNum = ratioOfPosNum + ratioValue;
            } else {
                ratioOfZeroNum = ratioOfZeroNum + ratioValue;
            }
        } 
        String output = String.format("%.5f", ratioOfPosNum);
        System.out.println(output);
        output = String.format("%.5f", ratioOfNegNum);
        System.out.println(output);
        output = String.format("%.5f", ratioOfZeroNum);
        System.out.println(output);
    }

}

public class PlusMinus {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
