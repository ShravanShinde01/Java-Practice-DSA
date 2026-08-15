
import java.util.*;

public class revTheString {

  public static String reverseString(String str){
      Stack<Character> s = new Stack<>();
      int idx = 0;

      while(idx < str.length()){
        s.push(str.charAt(idx));
        idx++;
      } 

      StringBuilder reasult = new StringBuilder();
      while(!s.isEmpty()){
          char curr = s.pop();
          reasult.append(curr);
      }

      return reasult.toString();
  }

    public static void main(String[] args) {
      String str = "shravan";

      String reasult =  reverseString(str);
      System.out.print(reasult);
    }
}

