import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.function.Supplier;

// This was the blocking code, wherein part after mailservice was used we were waiting for it to be completed 
// before we started off with next code
// public class MailService {
//     public void send(){
//         try{
//             Thread.sleep(5000);
//         }
//         catch (Exception e){
//             e.printStackTrace();
//         }
//         System.out.println("Mail was sent...");
//     }

//     public static void main(String args[]){
//         MailService service = new MailService();
//         service.send();
//         System.out.println("Hello world");
//     }
// }

public class MailService {
    public void send(){
        try{
            Thread.sleep(2000);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("Mail was sent...");
    }

    public CompletableFuture<Void> sendAsync(){
        // pass the sync method inside this completable future, which will run on another 
        // thread in the threadpool
        return CompletableFuture.runAsync(() -> send());
    }

    public static void main(String args[]){
        MailService service = new MailService();
        service.sendAsync();
        System.out.println("Hello world");

        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }  
    }
}
