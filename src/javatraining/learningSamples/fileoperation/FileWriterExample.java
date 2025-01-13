package javatraining.learningSamples.fileoperation;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Logger;
import java.util.stream.Stream;

public class FileWriterExample {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(FileWriterExample.class.getName());
        // Array of strings to be written to the file
        String[] phrases = {"Sample", "Text", "For", "File", "Write"};
        // Path to the file where the text will be written
        String filePath = "C://Users//vinee//OneDrive//Documents//FIleWriterOperation.txt";
        //Attempt to open the file and write phrases to it
        try(PrintWriter writer = new PrintWriter(Files.newBufferedWriter(Paths.get(filePath)))) {
            // Writing each string from the array to the file using a stream
            Stream.of(phrases).forEach(writer::println);
            //Notify user of successful write operation
            System.out.println("Text has been successfully written to the file.");
            logger.info("Text has been successfully written to the file.");
        } catch (IOException e) {
            // Handle potential IO exceptions such as file not found or access issues
            e.printStackTrace();
        }
    }
}
