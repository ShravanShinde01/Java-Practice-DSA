

public class recursion {

  // print number in increasing order 
  public static void printIncreasing(int n){
   // base case
   if(n==1){
    System.out.print(n+" ");
    return;
   }
    
    printIncreasing(n-1);
    System.out.print(n+" ");

  }

  //print number in decreasing order
  public static void printDecreasint(int n){
    // base case
    if(n==1){
      System.out.print(n+" ");
      return;
    }
      System.out.print(n+" ");
      printDecreasint(n-1);
  }
  
  // find factorial of n
  public static int factorial(int n){
    // base case
    if(n==0){
       return 1;
    }
    int fnm1 = factorial(n-1);
    int fact = n * fnm1 ;

    return fact;
  }

  // print sum of n natural numbers
  public static int printSum(int n){
     //base case
     if(n==1){
      return 1;
     }
    int fnm1 = printSum(n-1);
    int sum = n + fnm1;

    return sum;
  }

  // print nth fibonacci number
  public static int fibonacci(int n){
    // base case
    if(n==0 || n==1){
      return n;
    }
    int fnm1 = fibonacci(n-1);
    int fnm2 = fibonacci(n-2);
    int fibo = fnm1 + fnm2;

    return fibo;
  }

  // check array is sorted or not
  public static boolean isSorted(int arr[], int i){
     if(i==arr.length-1){
        return true;
     }
     if(arr[i] > arr[i+1]){
        return false;
     }
     
     return isSorted(arr,i+1);
  }

  // find first occurance of element in array
  public static int  firstOccur(int arr[], int key,int i){
    // base case
    if(i==arr.length-1){
      return -1;
    }
     if(arr[i]==key){
       return i;
     }
      return firstOccur(arr,key,i+1);
  }

  // find last occurance
  public static int lastOccur(int arr[], int key, int i){
    // base case
    if(i==arr.length){
      return -1;
    }
    int isFound = lastOccur(arr, key, i+1);

    if(isFound==-1 && arr[i]==key){
      return i;
    }

    return isFound;
  }

  // x^n power calculate
   public static int power(int x, int n){
    // base case
    if(n==0){
      return 1;
    }
      int xnm1 = power(x,n-1);
      int xn = x * xnm1;

      return xn;
   } 
  
   // optimised power calculate
   public static int optimisedPower(int x, int n){
    //base case
    if(n==0){
      return 1;
    }
     int halfPow = optimisedPower(x,n/2) ;
     int halfPowerSq = halfPow * halfPow;

     if(n%2!=0){
        halfPowerSq = x * halfPowerSq;
   }
     return halfPowerSq;
   }
  
   public static void main(String[] args) {
      
      int arr[] = {2,4,6,10,10};
      int key = 10;
      int x =2;
      int n = 5;


      // printIncreasing(n);
      // printDecreasint(n);
      // System.out.print(printSum(n));
      // System.out.print(factorial(n));
      // System.out.print(fibonacci(n));
      // System.out.print(isSorted(arr,0));
      // System.out.print(firstOccur(arr,key,0));
      //  System.out.print(lastOccur(arr,key,0));
      // System.out.print(power(x,n));
      // System.out.print(optimisedPower(x,n));
      
  }
}
