/*


Program3. Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.
Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock. 
- 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.
Example
Return '12:01:00'.
Return '00:01:00'.
Sample Input
07:05:45PM
Sample Output
19:05:45


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
import java.text.SimpleDateFormat;  

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
    // Write your code here
        String subString1 = "";
        String subString2 = "";
        String subString3 = "";
        if(s.trim().length()==10) {
           subString1 = s.substring(s.length()-2, s.length());
           subString2 = s.substring(0, 2);
           subString3 = s.substring(2, s.length()-2);
           if(subString1.equalsIgnoreCase("pm") && Long.valueOf(subString2)<12l) {
        subString2 = Long.toString(Long.valueOf(subString2)+Long.valueOf(12));
        
           } else if(subString1.equalsIgnoreCase("am") && Long.valueOf(subString2)==12l) {
               subString2 = "00";
           } 
           
        }
        return ""+subString2+subString3;       
    }

}

public class TimeConversion {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
