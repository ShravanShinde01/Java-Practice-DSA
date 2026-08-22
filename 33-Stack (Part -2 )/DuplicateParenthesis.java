import java.util.*;

public class DuplicateParenthesis {
   public static boolean isDuplicate(String str){
       Stack<Character> s = new Stack<>();

       for(int i=0; i<str.length(); i++){
          char ch = str.charAt(i);

          // Closing
          if(ch==')'){
            int count = 0;

            while(s.peek()!='('){
                s.pop();
                count++;
            }

            if(count<1){
               return true; // duplicate exist  
            }
            else{
                s.pop();  // opening pair
            }
         }
         
         else{ // opening pair
             s.push(ch);
         }
       }
       return  false;
   }


    public static void main(String[] args) {
        String str = "((a+b)+(c+d))";

        System.out.println(isDuplicate(str));
    }
}
