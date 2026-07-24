

public class tcUnderstand {

  // for print array
  public static void printArr(int arr[]){
    for(int i=0; i<arr.length; i++){
       System.out.print(arr[i]+" ");
    }
  }

  //Linear search
  public static void linearSearch(int arr[],int key){//------> Tc = O(n), Wrost case.
      for(int i = 0; i<arr.length; i++){
          if(arr[i]==key){
            System.out.print("key is at index : "+i);
            return;
          }
      }
      System.out.print("key doesnot exist in arr");
  }

  // Binary search
  public static void binSearch(int arr1[], int key){ //------> Tc = O(log(n)), Wrost case.
     int si = 0;
     int ei = arr1.length-1;

     while(si<=ei){
      int mid = si + (ei-si)/2 ;

      if(arr1[mid]==key){
         System.out.print("key is at index : "+mid);
         return;
      }
      if(key<mid){
        ei= mid-1;
      }
      else{
        si= mid+1;
      }
     }
     System.out.print("key doesnot exist in arr1");
  }

  // bubble sort
  public static void bubbleSort(int arr[]){ //------> Tc = O(n^2), Wrost case.
    int n = arr.length;

      for(int i= 0; i<n-1; i++){
          for(int j = 0; j<n-1-i; j++){
               if(arr[j]>arr[j+1]){
                  // swaping
                  int temp = arr[j+1];
                  arr[j+1] = arr[j];
                  arr[j] = temp;
               }
          }
      }
  }


    public static void main(String[] args) {
      int arr[] = {1,4,2,6,3,9};
      int arr1[] = {2,3,4,5,6,7,8,9};
      int key = 9;

      // linearSearch(arr,key);
      // bubbleSort(arr);
      // printArr(arr);
      binSearch(arr1,key);
    }
}