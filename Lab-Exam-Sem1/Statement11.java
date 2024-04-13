import java.io.File;
import java.io.FileOutputStream;

public class Statement11 {
    public static void main(String[] args) {
        String filepath = "myfile.txt";
        File newfile = new File(filepath);

        try{
            FileOutputStream fos = new FileOutputStream(newfile);
            String content = "This is my first file to be handled in java";
            fos.write(content.getBytes());
            fos.close();

            System.out.println(newfile.length());
        }catch(Exception e){
            System.out.println(e.getLocalizedMessage());
        }
    }
}
