import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * This class will explain enhancement of try with resources block which was
 * introduced with JDK9 .
 *
 * @author akhtar.jahan.qureshi@gmail.com
 *
 */
public class ExmapleUsingJava9 {

       public static void main(String[] args) throws FileNotFoundException {
             FileOutputStream fileStream = new FileOutputStream("App.log");
             try (fileStream) {
                    String logMessage = "[INFO] DATA NEED TO BE WRITTEN";
                    byte logMessageInBytes[] = logMessage.getBytes();
                    fileStream.write(logMessageInBytes);
                    System.out.println("Updated log files.");
             } catch (Exception e) {
                    // handle error
             }
       }
}
