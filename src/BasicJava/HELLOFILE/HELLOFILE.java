/**
 * Write a description of HelloFile here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class HELLOFILE {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("Hello.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }
        catch (IOException e){
        }
    }
}
