import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class RemoteService {
    public static User fetchUser() throws InterruptedException {
        Thread.sleep(1000); // Simulate delay
        if (Math.random() > 0.1) { // 90% chance to succeed
            return new User("John Doe", "john.doe@example.com");
        } else {
            throw new RuntimeException("Failed to fetch user data");
        }
    }

    public static String extractEmailDomain(User user) {
        String email = user.getEmail();
        return email.substring(email.indexOf("@") + 1);
    }
}

class User {
    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}

public class CallablesAndFuturesExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        try {
            CompletableFuture<User> userFuture = CompletableFuture.supplyAsync(() -> {
                try {
                    return RemoteService.fetchUser();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }, executor);

            CompletableFuture<String> emailDomainFuture = userFuture.thenApply(user -> {
                return RemoteService.extractEmailDomain(user);
            });

            emailDomainFuture
                .thenAccept(domain -> System.out.println("User's email domain: " + domain))
                .exceptionally(e -> {
                    System.err.println("Exception occurred: " + e.getMessage());
                    return null;
                })
                .join(); // Wait for the completion

        } finally {
            executor.shutdown();
        }
    }
}
