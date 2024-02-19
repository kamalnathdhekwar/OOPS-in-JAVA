import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class arrayList {
    public static class ArrayList{
        int[] arr = new int[5];
        int size = 0 ;
        int idx = 0 ;

        // method to add element in the array //
        public void add(int ele)
        {
            // if array is full , the values will goes to second array
            if(size==arr.length)
            {
                int[] brr = Arrays.copyOf(arr, arr.length*2);
               arr = brr ;
            }
    arr[idx]=ele;
    size++;
    idx++ ;
        }
 // array set method //
         public void set(int idx , int val)
         {
            arr[idx]=val;
         }
    }
    public static void main(String[] args) {
        // ArrayList<Integer> arr = new ArrayList<>();
        // arr.add(1);
        // arr.add(2);
        // arr.add(16);
        // arr.add(3);
        // arr.set(1,20);
        ArrayList arr = new ArrayList();
        arr.add(2);
        arr.add(1);
        arr.add(1);
         System.out.println(arr.size);
         arr.set(0, 222);
      

    }
}
