public class bitPractic{

  // is Even
  public static boolean isEven(int n){
    int bitMask = 1;
       if((n&bitMask)!=0){
           return false;
       }
       return true;
  }

  //Get ith bit
  public static void getIthBit(int n, int i){
    int bitMask = 1<<i;
    if((n&bitMask)==0){
      System.out.print("i-th bit is : 0");
    }
    else{
    System.out.print("i-th bit is : 1");
    }
  } 

  //set ith bit`````~~~
  public static int setIthBit(int n, int i){
     int bitMask = 1<<i;
      return n | bitMask;
  }

  //clear ith bit
  public static int clearIthBit(int n, int i){
    int bitMask = ~(1<<i);
     return n & bitMask;
  }


  
  public static void main(String[] args) {
      int n = 7;
      int i = 2;
      // System.out.print(isEven(n));
      // getIthBit(n,i);
      // System.out.print(setIthBit(n,i));
      System.out.print(clearIthBit(n,i));


    }
 }

