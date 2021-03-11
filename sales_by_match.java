    import java.io.*;
    import java.math.*;
    import java.security.*;
    import java.text.*;
    import java.util.*;
    import java.util.concurrent.*;
    import java.util.regex.*;

import javax.swing.ProgressMonitorInputStream;

    public class Solution {

        // Complete the sockMerchant function below.
        static int sockMerchant(int n, int[] ar) {
            List<Integer> checkedArr = new ArrayList<>();
            int color = 0;
            int totalPairs = 0;
            
            for (int i = 0; i < ar.length; i++) {
                if (!checkedArr.contains(ar[i])) {
                    checkedArr.add(ar[i]);
                    for (int j = 0; j < ar.length; j++) {
                        if (ar[i] == ar[j]) {
                            color++;
                        }
                    }
                    totalPairs += color/2;
                    color = 0;
                }
            }

            return totalPairs;
        }

        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) throws IOException {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] ar = new int[n];

            String[] arItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int arItem = Integer.parseInt(arItems[i]);
                ar[i] = arItem;
            }

            int result = sockMerchant(n, ar);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();

            bufferedWriter.close();

            scanner.close();
        }
    }
