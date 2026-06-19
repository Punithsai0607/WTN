import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class CountFile {
    public static void main(String[] args) {
        String filePath = "students.txt";
        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                lineCount++;
                String[] words = line.split("\\s+");
                wordCount += words.length;
                charCount += line.length();
            }
        } catch (IOException e) {
            e.printStackTrace();
    
        }
    }
}
