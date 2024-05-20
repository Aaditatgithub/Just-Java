package Statement15;
import javax.swing.tree.ExpandVetoException;

public class Statement15 {
    public static void main(String args[]){
        int[] arr = new int[5];
        try{
            // System.out.println(21412/0);
            System.out.println(arr[-1]);
        }catch(Exception e){
            System.out.println("Exception: " + e.getClass() + ":: " + e.getCause());
        }
    }
}
