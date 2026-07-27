public class backTrack{
    // find subset 
  public static void findSubset(String str, String ans, int i){
       // base case
       if(i==str.length()){
          if(ans.length()==0){
             System.out.println("Null");
          }else{
            System.out.println(ans);
          }
          return;
       }

       // kaam
       // yes choice
       findSubset(str,ans+str.charAt(i),i+1);
       //No choice
       findSubset(str,ans,i+1);
  }

  // find permutation
  public static void findPermutation(String str, String ans){
      // base case:
      if(str.length()==0){
        System.out.println(ans);
        return;
      }
      // kaam
      for(int i= 0; i<str.length();i++){
         char curr = str.charAt(i);
         String  newStr = str.substring(0,i) + str.substring(i+1);
         findPermutation(newStr, ans+curr);
      } 
        
  }

    public static void main(String[] args) {
      String str = "abc";
  
      // findSubset(str,"",0);
      findPermutation(str,"");
    }
}