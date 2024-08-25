import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseArr {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13};
        int j = arr.length - 1;
        int i = 0;

        // Collections.reverse(Arrays.stream(arr).boxed().collect(Collectors.toList()));
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp; 
            i++; j--;
        }

        for (int k : arr) {
            System.out.println(k);
        }

    }
}
