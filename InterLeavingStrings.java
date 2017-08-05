import java.util.*;
//import java.util.Arrays;
import java.util.List;


/*Find out if a string is interleaving against two provided strings*?

public class InterLeavingStrings{
    
    /*find if two strings are inter-leaving*/
    
    public static boolean inter_leaving(String a, String b, String final1){
      
      int i = 0;
      int a_ptr = i; 
      int b_ptr = i;
      
      String str = "testString";
      char[] char_array_a = a.toCharArray();
      //Character[] char_array_a = ArrayUtils.toObject(char_array_ab);
      char[] char_array_b = b.toCharArray();
      char[] char_array_final = final1.toCharArray();
      //Character[] charObjectArray = ArrayUtils.toObject(charArray);
      
      if (char_array_final[0] != char_array_a[0] && char_array_final[0] != char_array_b[0]){
          System.out.println("Final: "+ char_array_final[0] + " a:" + char_array_a[0] + " b:" + char_array_b[0]);
          return false;
          
      } 
        
    
      if (char_array_final[0] == char_array_a[0] || char_array_final[0] == char_array_b[0]){      
        while (i < final1.length() ) {
          
            if ((char_array_final[i] == char_array_a[a_ptr]) && (a_ptr <= char_array_a.length-1)) 
            {
                i++;
                a_ptr++;
                System.out.println("First if: ");
                
            }
            else if ((char_array_final[i] == char_array_b[b_ptr]) && (b_ptr <= char_array_b.length-1)) 
            {
                i++;
                b_ptr++;
                System.out.println("Else if: ");
                
            }
          	else { 
          	  System.out.println("Else  ");
              return false; 
            }
        }
      }
      return true;
    }
    
     public static void main(String []args){
        String a = "abcdfsdfd";
        String b = "efghjj";
        String final_string = "abcdfsdfdefghjj";
        boolean inter = inter_leaving(a, b, final_string);
        System.out.println(inter);
     }
}
