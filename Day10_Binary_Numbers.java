import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        List binary = new ArrayList<>(); 
        int consecutives = 0;
        int maxConsecutives = 0;
        String s = "";
        int remainder = 0;
        
        while (n > 0) {
            remainder = n%2;
            n = n/2;
            if (remainder >= 1) {
                consecutives++;
                if (consecutives > maxConsecutives) {
                    maxConsecutives = consecutives;
                }
            }else if (remainder == 0) {
                consecutives = 0;
            }
        }

        System.out.print(maxConsecutives);

        scanner.close();
    }
}
