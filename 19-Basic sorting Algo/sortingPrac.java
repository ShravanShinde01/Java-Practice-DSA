import java.util.*;

public class sortingPrac {

   // To print array
   public static void print(int arr[]){
      for(int i= 0; i<arr.length; i++){
         System.out.print(arr[i]+" ");
      }
   }
  
    // Bubble sort
    public static void bubbleSort(int arr[]){
       for(int turn= 0 ; turn< arr.length - 1; turn++){
          for(int j=0; j< arr.length-turn-1; j++){
              
              if(arr[j]>arr[j+1]){
                  // swap
                  int temp = arr[j];
                  arr[j] = arr[j+1];
                  arr[j+1] = temp;
              }
          }
       }
    }

   // selection sort
   public static void selectionSort(int arr[]){
      for(int i= 0; i<arr.length; i++){
         int minPos  = i;
          
         for(int j=i+1; j<arr.length; j++){
            if(arr[minPos]>arr[j]){
              minPos = j;
            }
         } 

         // swping
         int temp = arr[minPos];
         arr[minPos]=arr[i];
         arr[i]=temp;
      }
   }
    
    // insertion sort
   public static void insertionSort(int arr[]){
       for(int i=1; i<arr.length; i++){

           int curr = arr[i];  //key
           int prev = i-1;

          while(prev>=0 && arr[prev]>curr){
               arr[prev+1] = arr[prev];
               prev--; 
          }
           
           // insert the key
           arr[prev+1] = curr;

       }

   }
   
   // inBuild sort
   public static void inbuildSort(int arr[]){
      Arrays.sort(arr);
   }

   // conting sort
   public  static void countingSort(int arr[]){

      int largest = Integer.MIN_VALUE;

    // Find largest element
    for (int i = 0; i < arr.length; i++) {
        largest = Math.max(largest, arr[i]);
    }

    // Create count array
    int count[] = new int[largest + 1];

    // Store frequencies
    for (int i = 0; i < arr.length; i++) {
        count[arr[i]]++;
    }

    // Rebuild sorted array
    int j = 0;

    for (int i = 0; i < count.length; i++) {

        while (count[i] > 0) {

            arr[j] = i;
            j++;

            count[i]--;
        }
    }
   }

   
    public static void main(String[] args) {
        //  int arr[] = {2,6,4,3,1};

         int arr[] = {1,4,1,3,2,4,3,7};

        //  bubbleSort(arr);
        // selectionSort(arr);
        // insertionSort(arr);
        // inbuildSort(arr);
        countingSort(arr);
         print(arr);

    }
}