import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


/* Find the minimum number of signal transmitters of range k to cover all buildings without overlapping.
   The transmitters can only be placed on buildings, and the locations of the buildings are
   input into the array x. If the location doesnt exist, you cannot place the transmitter
   in that particular location. */
   
public class Transmitters {

    
    public static boolean exists(int[] array, int val){
        for (int i=0; i<array.length; i++){
            if (array[i] == val){
                return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();//number of positions
        int k = in.nextInt();//range
        int[] x = new int[n];
        int number = 0;
        for(int x_i=0; x_i < n; x_i++){
            x[x_i] = in.nextInt();//locations
        }
        int max = 0, min = 100;
        for (int y = 0; y < x.length; y++){
            if (min > x[y])
                min = x[y];
            if (max < x[y])
                max = x[y];
        }
        
        int next_pos = min + k;
        while (next_pos <= max && min < max){
          if (exists(x, next_pos) ){
              next_pos += 2*k + 1;
              number++;
              min = next_pos-k;
          } else {
              next_pos--;
          }
          
          if (min > next_pos){
              next_pos++;
              next_pos += 2*k + 1;
              min = next_pos-k;
              
          }
         
          if (next_pos > max && exists(x,min)){
              number++;
          }
        }
        
        System.out.println(number);
    }
}

