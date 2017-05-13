package hr.str;

import java.util.HashSet;
import java.util.Set;

public class LongestDistinctSubString {

  public static void main(String[] args) {
    
    Set<String> cases = new HashSet<>();
    cases.add("abcadf");
    cases.add("abcaa");
    cases.add("ababcd");
    cases.add("abcdef");
    cases.add("baaab");
    cases.add("abacbe");
    cases.add("abacdeefgh");
    
      for (String s : cases) {
        findMaxLenUniqueStr(s);
      }    
  }

  private static void findMaxLenUniqueStr(String s) {
    int max = 0;
    int count;
    Set<Character> set = new HashSet<>();
    char[] ca;

    for (int i = 0; i < s.length(); i++) {
      set.clear();
      count = 0;
      
      ca = s.substring(i, s.length()).toCharArray();
      if (max >= ca.length) {
        break;
      }
      for (int j = 0; j < ca.length; j++) {
        char ch = ca[j];

        if (set.contains(ch)) {
          if (count > max) {
            max = count;
          }
          
          if (max >= ca.length - j) {
            break;
          }
        } else {
          count++;
          set.add(ch);
        }
        if(count > max){
          max = count;
        }
      }

    }
    System.out.println(s + " : " +max);
  }

}
