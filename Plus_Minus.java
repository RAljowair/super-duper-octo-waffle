import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        float plusCounter = 0;
        float minusCounter = 0;
        float zeroCounter = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                plusCounter++;
            }else if (arr[i] < 0) {
                minusCounter++;
            } else {
                zeroCounter++;
            }
        }
        
        float plusRatio = (plusCounter/arr.length);
        float minusRatio = (minusCounter/arr.length);
        float zeroRatio = (zeroCounter/arr.length);

        System.out.printf("%.6f\n", plusRatio);
        System.out.printf("%.6f\n", minusRatio);
        System.out.printf("%.6f\n", zeroRatio);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
