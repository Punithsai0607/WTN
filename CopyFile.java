import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class CopyFile {
    public static void main(String[] args){
        try(FileInputStream in = new FileInputStream("students.txt");
            FileOutputStream out = new FileOutputStream("students.txt")) {
            int bytedata;
            while((bytedata = in.read()) != -1){
                out.write(bytedata);
            }
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
