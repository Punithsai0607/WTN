
import java.io.FileWriter;

public class WriteFile{
    public static void main(String[] args) {
        try(FileWriter fw = new FileWriter("Students.txt")) {
            fw.write("Raja is learning Java");
            fw.write("Day1: Interface Done");
        } catch ( Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}