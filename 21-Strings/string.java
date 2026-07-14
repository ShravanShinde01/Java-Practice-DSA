import java.util.*;

public class string {

  public static boolean isPaledrom(String str){
      int n = str.length();

      for(int i= 0; i<n/2; i++){
        if(str.charAt(i) != str.charAt(n-i-1)){
          return false;
        }
      }
      return true;
      
  }
   
  public static float shortestPath(String path){
    int x = 0;
    int y = 0;

    for(int i = 0; i<path.length(); i++){
      char ch = path.charAt(i); 
      // East
      if(ch == 'E'){
         x++;
      }
      else if(ch=='W'){
         x--;
      }
      else if(ch=='N'){
         y++;
      }
      else{
        y--;
      }
    }
    System.out.println("reach at index : ("+x+","+y+")");
    int X2 = x*x;
    int Y2 = y*y;

    return (float)Math.sqrt(X2+Y2);
  }

  public static void priSubString(String str){
    for(int i = 0; i<str.length();i++){
      for(int j = i+1; j<=str.length();j++)

        System.out.println(str.substring(i,j));
    }
    System.out.println();
  }


    public static void main(String[] args) {
      String str = ("racecar");
      String path = ("WNEENESENNN");

    
 
    priSubString(str);


    //  System.out.print( isPaledrom(str) );
    // System.out.print(shortestPath(path));
    
    }
}

    


