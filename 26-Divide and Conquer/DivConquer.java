public class DivConquer {

   // printing array
public static void printArr(int arr[]){
  for(int i=0; i<arr.length; i++){
    System.out.print(arr[i]+" ");
  }
}

  // merge sort
public static void mergeSort(int arr[],int si, int ei){
     // base case 
     if(si>=ei){
      return;
     }

     // kaam
     int mid = si + (ei-si)/2;
     mergeSort(arr,si,mid);
     mergeSort(arr,mid+1,ei);
     merge(arr,si,ei,mid); 
      
}

   // merge
 public static void merge(int arr[],int si, int ei, int mid ){
   int temp[] = new int[ei-si+1];
   int i = si;  // iterator for left side
   int j = mid+1;  // iterator for right side
   int k = 0;   // iterator for temp arr

   while(i<=mid && j<=ei){
      if(arr[i]<arr[j]){
        temp[k]=arr[i];
        i++;
      }
      else{
        temp[k]=arr[j];
        j++;
      }
      k++;
   }

   // for left
   while(i<=mid){
    temp[k] = arr[i];
      k++; i++;
   }

   //right part
   while(j<=ei){
    temp[k] = arr[j];
      k++; j++;
   }

   // copy temp to original array
   for(k= 0,i= si; k<temp.length; k++, i++){
      arr[i] = temp[k];
   }
}


    //quick sort
    public static void quickSort(int arr[], int si, int ei){
      // base case
      if(si>=ei){
        return;
      }

      // last element
      int pivotIdx = partetion(arr,si,ei);
      quickSort(arr,si,pivotIdx-1); // left
      quickSort(arr,pivotIdx+1,ei); // right

    } 
   
   
    // partetion array
    public static int partetion(int arr[],int si, int ei){
      int pivot = arr[ei];
      int i = si-1; // to make place for saller than pivot

      for(int j=si; j<ei; j++){
         if(arr[j]<= pivot){
            i++;
            // swaping
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
         }
      }

         i++;
         //swap
         int temp =pivot;
         arr[ei] = arr[i];
         arr[i] = temp;

         return i;
    }
      
    // search in rotated sorted array
    public static int searchInRorSorArr(int arr2[], int target, int si, int ei){
       // base case
       if(si>ei){
        return -1;
       }
        // kaam
       int mid = si+(ei-si)/2;

       // case found
       if(arr2[mid]==target){
        return mid;
       }

       //mid on L1
       if(arr2[si]<=arr2[mid]){
            //case a : left.
           if(arr2[si]<=target && target<arr2[mid]){
            return searchInRorSorArr(arr2,target,si,mid-1);
           }
           else{
            // case b : right.
            return searchInRorSorArr(arr2,target,mid+1,ei);
           }
        }

          // mid on line L2
        else{
          // case c: right
            if(target>arr2[mid] && target<=arr2[ei]){
                return searchInRorSorArr(arr2,target,mid+1,ei);
            }
            else{
              // case D : left
              return searchInRorSorArr(arr2,target,si,mid-1);
            }
        }


    }

      // main
  public static void main(String[] args) {
      int arr[] = {6,3,9,5,2,8,-2};
      int arr2[] = {4,5,6,7,0,1,2};
      int target = 0;

      mergeSort(arr,0,arr.length-1);
      // quickSort(arr,0,arr.length-1);
      printArr(arr);
      //  int taridx =  searchInRorSorArr(arr2, target, 0, arr2.length-1);
      //  System.out.print(taridx);
    }
}
