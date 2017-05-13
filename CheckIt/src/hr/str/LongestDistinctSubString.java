package hr.str;

import java.util.HashSet;
import java.util.Set;

public class LongestDistinctSubString {

  public static void main(String[] args) {
    int max = 0;
    int count = 0;
    String s = "abcadf";
    
    char p = '-';
    Set<Character> set = new HashSet<>();
    char[] ca = s.toCharArray();
    
    for(int i =0 ;i < ca.length;i++){
      
    }
    
    for (char c : s.toCharArray()) {
      if(set.contains(c)){
        if(count > max){
          max = count;
        }
        count = 0;        
      }else{
        count++;
        p = c;
      }
    }
    
    System.out.println(max);

  }

}
