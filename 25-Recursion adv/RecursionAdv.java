public class RecursionAdv {
    // Tiling problem
  public static int tilingPro(int n){
      // base case
        if(n==0 || n==1 ){
          return 1;
        }

       // kaam
       // vertical place
       int fnm1 = tilingPro(n-1);

       //Horizontal problem
       int fnm2 = tilingPro(n-2);

       int totWay = fnm1 + fnm2;

       return totWay; 
  }

  //remove duplicate in String
  public static void removeDuplicate(String str, int idx, StringBuilder newStr, boolean map[]){
     //base case
     if(idx==str.length()){
         System.out.print(newStr);
         return;
     }
     //kaam
     char currChar = str.charAt(idx);
     if(map[currChar-'a'] == true){
          removeDuplicate(str,idx+1,newStr,map);
     }
     else{
         map[currChar-'a' ]= true;
         removeDuplicate(str,idx+1,newStr.append(currChar),map);
     }
  }

  // friends pairing problem
  public static int friendspair(int n){
      // base case
      if(n==1 || n==2){
           return n;
      }
      
      // kaam
      // be sigle 
      int fnm1 = friendspair(n-1);
       
      // pairing
      int fnm2 = friendspair(n-2);
      int pairWay = (n-1) * fnm2;

      int totWay = fnm1 + pairWay ;

      return totWay;
  }

  // binary string problem
  public static void binaryStr(int n, int lastPlace, String str1){
      // base case
      if(n==0){
        System.out.println(str1);
        return;
      }

      // kaam
      if(lastPlace==0){
        binaryStr(n-1,0,str1+"0");
        binaryStr(n-1,1,str1+"1");
      }
      else{
        binaryStr(n-1,0,str1+"0");
      }
  }

    public static void main(String[] args) {
      int n = 3;
      String str = "appppnaaacollegeeee";
      int idx = 0;
      StringBuilder newStr = new StringBuilder("");
      boolean map[] = new boolean[26]; 
      String str1 = "";

      // System.out.print(tilingPro(n));
      // removeDuplicate(str,idx,newStr,map);
      // System.out.print(friendspair(n));
      binaryStr(n,0,str1);
    }
}