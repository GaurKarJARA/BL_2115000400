import java.io.*;

public class ReadaFileUsingFilereader {
    public static void main(String[] args) {
        String filePath = "example.txt";
        try (FileReader fr = new FileReader(filePath);
             BufferedReader br = new BufferedReader(fr)) {

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}