 import java.io.*;

public class ConvertByteStreamtoChar {
    public static void main(String[] args) {
        String filePath = "example.txt"; 

        try (FileInputStream file = new FileInputStream(filePath);
             InputStreamReader ins = new InputStreamReader(file, "UTF-8");
             BufferedReader br = new BufferedReader(ins)) {

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}