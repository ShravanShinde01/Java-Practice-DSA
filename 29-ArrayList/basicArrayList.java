import java.util.*;

public class basicArrayList {
    public static void main(String[] args) {
      // ArrayList creation
      ArrayList<Integer> list = new ArrayList<>();

      // add operaion (adding element in ArrayList)
      list.add(1);  //-----> tc = O(1)
      list.add(5);
      list.add(3);
      list.add(2);
      list.add(9);

      System.out.println(list);

      // add at specific index
    //   list.add(0,100);   //------- tc = O(n)
    //   System.out.println(list);

      // get operation (get element at given index)
    //   int element = list.get(4);   //-----> tc = O(1)
    //   System.out.println(element);

      // delete element in list
    //   list.remove(4);    //---------- tc = O(n)
    //   System.out.println(list);

      // set 
    //   list.set(2,10);    //------- tc = O(n)
    //   System.out.println(list);

      // contains
    //   System.out.println(list.contains(10)); //----- tc = O(n)

      // size of ArrayList
    //   System.out.println(list.size());

      // print arrayList, for looping and iteration
    //   for(int i=0; i<list.size(); i++){
    //      System.out.print(list.get(i)+" ");
    //   }
    //   System.out.println();

      // print reverse od an arrayList
    //   for(int i= list.size()-1; i>=0; i--){
    //      System.out.print(list.get(i)+" ");
    //   }
      
      // sort arrayList
      Collections.sort(list);
      System.out.println(list);

      // sort in decending order
      Collections.sort(list, Collections.reverseOrder());
      System.out.print(list);
    }
}