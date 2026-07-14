public class sorting {
    public static void bubbleSort(int arr[]){
        for(int i = 0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){

               if(arr[i]>arr[j]){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
              }
            }
        }
        return  bubbleSort;
    }

    public static void main(String[] args) {
        int arr[] = {5,1,4,3};
    

    }
}
