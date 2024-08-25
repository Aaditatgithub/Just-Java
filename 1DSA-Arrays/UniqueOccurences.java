import java.util.*;

public class UniqueOccurences {

    private static boolean findUniqueOccurences(Integer[] array){
      
      HashMap<Integer, Integer> countOccurences = new HashMap<>();
      HashSet<Integer> isExist = new HashSet<>();
      
      for (int i = 0; i < array.length ; i++){
        countOccurences.put(array[i],countOccurences.getOrDefault(array[i],0)+1);
      } 
      
      for(int val: countOccurences.values()){
        if(!isExist.contains(val)) isExist.add(val);
        else return false;
      }
      return true;
    }
    }
    public static void main(String[] args) {
      Integer[] array = new Integer[]{1,2,2,3,3,4,2,2,3,4};
      
      //call the functions
    }
}