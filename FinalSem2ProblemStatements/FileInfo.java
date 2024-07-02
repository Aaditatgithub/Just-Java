import java.io.File;
import java.util.Scanner;

public class FileInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the file name
        System.out.println("Enter the file name: ");
        String fileName = sc.nextLine();

        // Create a File object
        File file = new File(fileName);

        // Check if the file exists
        if (file.exists()) {
            System.out.println("File exists: Yes");

            // Check if the file is readable
            System.out.println("File is readable: " + (file.canRead() ? "Yes" : "No"));

            // Check if the file is writable
            System.out.println("File is writable: " + (file.canWrite() ? "Yes" : "No"));

            // Determine the type of file
            if (file.isDirectory()) {
                System.out.println("Type of file: Directory");
            } else if (file.isFile()) {
                System.out.println("Type of file: Regular file");
            } else {
                System.out.println("Type of file: Unknown");
            }

            // Get the length of the file in bytes
            System.out.println("Length of the file in bytes: " + file.length());
        } else {
            System.out.println("File exists: No");
        }

        sc.close();
    }
}
