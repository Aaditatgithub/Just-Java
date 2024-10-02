public class ReachHome{
    
    private static void reachHome(int src, int dest){
        
        //base case
        if(src == dest) {
            System.out.println("Reached home");
            return;
        }

        //processing 
        src++;

        // recursive case
        reachHome(src, dest);
    }

    public static void main(String[] args) {
        int dest = 10;
        int src = 0;

        reachHome(src, dest);


        return 0;
    }
}