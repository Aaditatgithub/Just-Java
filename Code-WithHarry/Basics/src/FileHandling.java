import javax.imageio.IIOException;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) {

        //Create new file
//        File myfile = new File("NAYAFILE.txt");
//        try{
//            myfile.createNewFile();
//        }
//        catch(IOException e){
//            System.out.println("unable to create file :: " + e);
//        }

            // New file writer
//        try{
//            FileWriter writer = new FileWriter("NAYAFILE.txt");
//            writer.write("This is my first insertion");
//            writer.close();
//        }
//        catch(IOException e){
//            e.printStackTrace();
//        }

            // Reading a file
        try{
            File myfile = new File("NAYAFILE.txt");
            Scanner sc = new Scanner(myfile);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
        }
        catch(IOException e){
            System.out.println("Exception :: " + e);
        }
        int i = 0b1111_0001;
        System.out.println(i);

        System.out.println( 4.0 / 0.0);



    }
}

