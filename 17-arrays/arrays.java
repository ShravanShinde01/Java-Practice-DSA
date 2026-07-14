public class arrays {

    public static void reverse_arr(int arr[]){
       int first = 0;
       int last = arr.length-1;

       while(first<last){
          int temp = arr[first];
          arr[first] = arr[last];
          arr[last] = temp;

          first++;
          last--;
       }

    }

    public static void pairs_in_arr(int arr[]){
         for(int i = 0; i<=arr.length-1; i++){
            for(int j = i+1; j<=arr.length-1; j++){
                System.out.println("("+arr[i]+","+arr[j]+")");
            }
            sout
         }
    }

    public static void main(String[] args) {
        int arr[] = {1,3,4,7,9};

        reverse_arr(arr);
        for(int i = 0; i<=arr.length-1; i++){

            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
