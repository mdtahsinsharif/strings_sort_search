import java.io.*;
import java.util.*;

public class Solution {

    public static int[] add(int a, int b, int k, int[] array1){
	        a--;
            b--;
            for(int i = a; a<=b; i++){
  	         array1[i] += k;
            }
        return array1;
    }
    
    public static void main(String[] args) {
        
        int n = 0, m = 0, a = 0, b = 0, k = 0;
        Scanner scan = new Scanner(System.in);
        
        n = scan.nextInt(); //size of array
        m = scan.nextInt(); //number of operations
        
        System.out.println(n + " " + m);
        
        int[] array1 = new int[n]; //size n
        int max = 0;
        
        for(int j = 0; j < m; j++){
            a = scan.nextInt(); //first index
            b = scan.nextInt(); //second index
            k = scan.nextInt(); //number
            System.out.println(a + " " + b + " " + k);
            array1 = add(a, b, k, array1);
        }

        for (int x = 0; x < array1.length; x++){
            if (max < array1[x])
                max = array1[x];
        }
        System.out.println(max);
    }
}