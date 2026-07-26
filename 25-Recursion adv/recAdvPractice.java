public class recAdvPractice {
    
    // Tiling problem
    public static int TilingProblem(int n){
        // base case
        if(n==0 || n==1){
          return 1;
        }
        //kaam
        int fnm1 = TilingProblem(n-1);
        int fnm2 = TilingProblem(n-2);

        return fnm1+fnm2;
          
    }

    // remove duplicate in string
    public static void removeBuplicate(String str, StringBuilder sb, boolean map[],int idx){
       // base case
       if(idx==str.length()){
          System.out.print(sb);
          return;
       }
       
       //kaam
       char currentChar = str.charAt(idx);
       if(map[currentChar-'a']==true){
          removeBuplicate(str,sb,map,idx+1);
       }
       else{
            map[currentChar-'a']=true;
            removeBuplicate(str,sb.append(currentChar),map,idx+1);
       }
    }

    // friends pairing problem
    public static int friendsPairing(int n){
      // base case
      if(n==1 || n==2){
        return n;
      }
      //kaam
      int fnm1 = friendsPairing(n-1);
      int fnm2 =friendsPairing(n-2);

      return fnm1 + (n-1) * fnm2;
    }
     
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
      String str = "aaaaaaabcddddddddefghijkkkkkkkklmnopqqqqqqqqrstuvwxyz";
      boolean map[] = new boolean[26];
      StringBuilder sb = new StringBuilder();
      String str1 = new String();

      // System.out.print(TilingProblem(n));
        // removeBuplicate(str,sb,map,0);
        // System.out.print(friendsPairing(n));
        binaryStr(n,0,str1);
    }
}

