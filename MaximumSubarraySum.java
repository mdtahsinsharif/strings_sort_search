import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MaximumSubarraySum {

    static long maximumSum(long[] a, long m) {
        int left = 0;
        int right = 0;
        long max = 0, val = 0;
        int diff = left-right;
        int start = 0;
        while ((diff) <= a.length-1){ 
            
            start = left;
            while (left <= right){
                val += a[left];
                left++;
            }
            right++;
            left = ++start;
            if (max < val % m)
                max = (val % m);
            val = 0;
            
            if (right >= a.length){
                diff++;
                right = diff;
                left = 0;
            }
        
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int n = in.nextInt();
            long m = in.nextLong();
            long[] a = new long[n];
            for(int a_i = 0; a_i < n; a_i++){
                a[a_i] = in.nextLong();
            }
            long result = maximumSum(a, m);
            System.out.println(result);
        }
        in.close();
    }
}