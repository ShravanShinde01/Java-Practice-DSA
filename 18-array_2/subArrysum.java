public class subArrysum{

    // max subarray sum -- ( Brute force ) 
    public static void subArrsum(int arr[]){
       
        int largest = Integer.MIN_VALUE;

        for(int i = 0; i<= arr.length-1; i++){
            for(int j = i; j<=arr.length-1; j++){
                 int sum = 0;
                for(int k = i; k<=j; k++){
                    sum = sum + arr[k];
                }
                System.out.println(sum);
                
                if(largest<sum){
                    largest = sum;
                }
            }
        }
        System.out.println("Max subArray sum is : "+ largest);
    }

    // max subarray sum -- ( prefix sum ) 
    public static void prefixSum(int arr[]){
      int maxSubarrSum = Integer.MIN_VALUE;  
      int currSum = 0;
      int prefix[] = new int[arr.length];
      

      prefix[0] = arr[0];
      for(int i = 1; i<arr.length; i++){
          prefix[i] = prefix[i-1] + arr[i];
        }

          for(int i = 0; i<=arr.length-1; i++){
               int start = i;
             for(int j =i; j<=arr.length-1; j++){
                int end = j ;
               currSum = start==0 ?prefix[end] : prefix[end] - prefix[start-1];

               if(maxSubarrSum < currSum){
                   maxSubarrSum = currSum;
               }
             }
      }
      System.out.println("max subArray sum is : "+ maxSubarrSum );
    }

    public static void kadansAlgo(int arr[]){
        // int maxSum = Integer.MIN_VALUE;
        // int currsum = 0;
        
        // for(int i = 0; i<=arr.length-1; i++){
        //      currsum = currsum + arr[i];
        //      if(currsum < 0){
        //         currsum = 0;
        //      }
        //      maxSum = Math.max(maxSum, currsum);
        // }
        // System.out.println(maxSum);

        // public static void kadanesAlgo(int arr[]) {
    int currSum = arr[0];
    int maxSum = arr[0];

    for (int i = 1; i < arr.length; i++) {
        currSum = Math.max(arr[i], currSum + arr[i]);
        maxSum = Math.max(maxSum, currSum);
    }

    System.out.println(maxSum);
}
    // }
    public static void main(String[] args) {
        int arr[] = {-1,-2,-6,-1,3};

       kadansAlgo(arr);
    }
}