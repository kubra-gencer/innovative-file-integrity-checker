package checker;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class IntegrityLogger {

    public static void log(String message) {

        try {
            FileWriter writer = new FileWriter("integrity_log.txt", true);

            writer.write("[" + LocalDateTime.now() + "]\n");
            writer.write(message + "\n");
            writer.write("----------------------------------\n");

            writer.close();

        } catch (IOException e) {
            System.out.println("Log file could not be written.");
        }
    }
}