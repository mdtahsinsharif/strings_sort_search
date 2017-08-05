import java.util.HashMap;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.*;

/* Given a bunch of strings where some of them are anagrams, sort these strings
 as such that the anagrams are grouped together. */

public class AnagramSorter{
    
    public static String[] anagram(String array[]){
        
        String[] original = new String[array.length];
            
        HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
        
        for (int i = 0; i<array.length; i++){
              original[i] = array[i];
              char[] chars = array[i].toCharArray();
              Arrays.sort(chars);
              String sorted = new String(chars);
              array[i] = sorted;
         
              if (map.containsKey(array[i])){
                ArrayList<String> value = new ArrayList<String>();
                value = map.get(array[i]);
                value.add(original[i]);
              } else {
                ArrayList<String> val = new ArrayList<String>();
                map.put(array[i], val);
                val.add(original[i]);
              }
        }

        ArrayList<String> list2 = new ArrayList<String>(0);
        for (Map.Entry<String, ArrayList<String>> entry1 : map.entrySet()) {
            ArrayList<String> list = entry1.getValue();

            Collections.sort(list);
            list2.addAll(list);
    	}
        
        String[] final_array = new String[list2.size()];
        final_array = list2.toArray(final_array);
        
        return final_array;
      }
    
     public static void main(String []args){
        String[] array_ques = {"silver", "rat", "art", "lisrev", "aa", "ab", "ba", "cat", "tac", "act"};
        String[] array_ans = anagram(array_ques);
        
        for (int i=0; i<array_ans.length; i++){
            System.out.println(array_ans[i]);
        }
     }
}
