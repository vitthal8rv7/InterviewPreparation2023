/* 


Program2. WAP Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers. Then print the respective minimum and maximum values as a single line of two space-separated long integers.
Example
input
arr = [1, 3, 5, 7, 9]
The minimum sum is 1+3+5+7=16, and the maximum sum is 3+5+7+9=24.
Output
The function prints
16 24


*/

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
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
    
        Integer min = arr.get(0);
        Integer max = arr.get(0);
        Long sum = 0l;
        for(Integer i: arr){
            sum = sum + Long.valueOf(i);
            min = min > i?i:min;
            max = max < i?i:max;
        }
        System.out.println(""+(sum-max)+" "+(sum-min));
    }

}

public class MiniMax {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
