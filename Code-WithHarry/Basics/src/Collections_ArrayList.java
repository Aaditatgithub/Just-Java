import java.util.ArrayList;

public class Collections_ArrayList {
    public static void main(String[] args) {
       ArrayList<Integer> arr = new ArrayList<>();
       arr.add(4);
       arr.add(3);
       arr.add(1);
       arr.add(76);
       arr.add(23);

//       for(int i : arr){
//           System.out.println(i + " ");
//       }
//        for(int i = 0; i < arr.size(); i++){
//            //System.out.println(arr[i] + " ");         //Wont work
//            System.out.println(arr.get(i) + " ");
//        }

        ArrayList<Integer> arr2 = new ArrayList<>(5);
        arr2.add(5);
        arr2.add(98);
        arr2.add(532);
        arr2.add(5883);
        arr2.add(23);
        arr2.add(5632);

        arr.addAll(arr2);

        for(Integer i : arr){
            System.out.println(i + " ");
        }
        System.out.println(arr.size());
        arr2.clear();

        //contains tells whether arraylist contains an element or not
    }
}
