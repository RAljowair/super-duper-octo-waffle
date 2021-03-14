import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
    // Write your code here
    int diagonalDiff = 0;
    int leftDiagnol = 0;
    int rightDiagnol = 0;
    int j = 0;

    // For loop to take the left to right diagonal
    for (int i = 0; i < arr.size(); i++) {
        leftDiagnol += arr.get(i).get(j);
        j++;
    }

    // Reinitialize the j to be the (array size - 1)
    j = arr.size()-1;

    // For loop to take the right to left diagonal
    for (int i = 0 ; i < arr.size() ; i++) {
        rightDiagnol += arr.get(i).get(j);
        j--;
    }

    diagonalDiff = leftDiagnol-rightDiagnol;

    return diagonalDiff < 0 ? diagonalDiff*-1: diagonalDiff;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < n; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);
        }

        int result = Result.diagonalDifference(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
