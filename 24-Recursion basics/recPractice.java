

public class recPractice {


   // print number in decreasing order
    public static void priDec(int n){
         // base case 
         if(n==1){
          System.out.print(n+" ");
          return;
         }
         // kaam
        System.out.print(n+" ");
        priDec(n-1);
    }

    // print increasing
    public static void priInc(int n){
       // base case 
       if(n==1){
        System.out.print(n+" ");
        return;
       }

       priInc(n-1);
       System.out.print(n+" ");
    }
    
    //factorial of n
    public static int factorial(int n){
         // base case
         if(n==0){
          return 1;
         }
         //kaam
         int fnm1 = factorial(n-1);
         int fact = n * fnm1;

         return fact;
    }

    // sum of n natural numbers
    public static int sum(int n){
      // base case
      if(n==1){
        return 1;
      }
      // kaam
      int fnm1 = sum(n-1);
      int sum = n + fnm1;

      return sum;
    }

    // find nth fibonacci number
    public static int fibonacci(int n){
        // base case
        if(n==0 || n==1){
          return n;
        }
        //kaam
        int fnm1 = fibonacci(n-1);
        int fnm2 = fibonacci(n-2);

        int nthno = fnm1 + fnm2;

        return nthno;
    }
     
    //check array is sorted or not
    public static boolean isSorted(int arr[],int i){
        // base case
        if(i==arr.length-1){
           return true;
        }
        //kaam
        if(arr[i]>arr[i+1]){
            return false;
        }
        
        return isSorted(arr,i+1);
        
    }
 
    // first occurance in arry
    public static int firstOccur(int arr[], int i, int key){
          // base case
          if(i==arr.length){
            return -1;
          }
          // kaam
          if(arr[i]==key){
            return i;
          }

          return firstOccur(arr,i+1,key);
    }

    // last occurance in array
    public static int lastOccur(int arr[],int i, int key){
       // base case
       if(i==arr.length){
        return -1;
       }

       int isSorted = lastOccur(arr,i+1,key);

       if(isSorted==-1 && arr[i]==key){
          return i;
       }

       return isSorted;
    }

    // x ^ n calc power
    public static int pow(int x, int n){
       // base case
       if(n==0){
        return 1;
       }
       //kaam
       int xnm1 = pow(x,n-1);
       int xXn = x * xnm1;

       return xXn;
    }

    // x ^ n optimised powe calc
    public static int optPower(int x, int n){
      // base case
        if(n==0){
          return 1;
        }
        //kaam
        int half = optPower(x,n/2);
        int halfSqr = half * half;

        if(n%2!=0){
           halfSqr = n + halfSqr;
        }

        return halfSqr;
    }

    public static void main(String[] args) {
       int n = 4;
       int x = 2;
       int arr[] = {2,3,4,5,4,7,5,9};
       
      //  priDec(n);
      // priInc(n);
      // System.out.print(factorial(n));
      // System.out.print(sum(n));
      // System.out.print(fibonacci(n));
      // System.out.print(isSorted(arr,0));
      // System.out.print(firstOccur(arr,0,5));
      // System.out.print(lastOccur(arr,0,5));
      // System.out.print(pow(x,n));
      System.out.print(optPower(x,n));

    }
}