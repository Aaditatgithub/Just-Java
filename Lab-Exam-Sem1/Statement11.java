import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;

public class Statement11 {
    public static void main(String[] args) {
        String filePath = "myfile.txt";
        File file = new File(filePath);

        try{
            //Reading File contents
            FileReader fReader = new FileReader(file);
            BufferedReader bReader = new BufferedReader(fReader);

            String line;
            while( (line = bReader.readLine()) != null){
                System.out.println(line);
            }

            System.out.println(file.length()/(1024.0 * 1024.0) + " MB");

            FileWriter fWriter = new FileWriter(file);
            BufferedWriter bWriter = new BufferedWriter(fWriter);
            bWriter.write("line", 0, 0);;
            bWriter.close();

        } catch (IOException e){
            System.out.println(e.getLocalizedMessage());
        }
    }
}
