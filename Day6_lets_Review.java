import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        List<Character> evenChar = new ArrayList<>();
        List<Character> oddChar = new ArrayList<>();
        String text;

        
        int totalCases = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int caseNumber = 0; caseNumber < totalCases; caseNumber++) {
           
            text = scanner.nextLine();

            for (int letter = 0; letter < text.length(); letter++) {
                if(letter%2 ==0){
                    evenChar.add(text.charAt(letter));
                }else{
                    oddChar.add(text.charAt(letter));
                }
            }

            for (int i = 0; i < evenChar.size() ; i++) {
                System.out.print(evenChar.get(i));
            }

            System.out.print(" ");

            for (int i = 0; i < oddChar.size(); i++) {
                System.out.print(oddChar.get(i));
            }

            System.out.println();

            evenChar.clear();
            oddChar.clear();
        }
        scanner.close();
    }
}