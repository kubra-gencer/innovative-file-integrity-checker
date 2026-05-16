package checker;

import java.util.HashMap;

public class IntegrityManager {

    private HashMap<String, FileRecord> records;

    public IntegrityManager() {
        records = new HashMap<>();
    }

    public void registerFile(String filePath) {
        String hash = HashGenerator.generateSHA256(filePath);

        if (hash.equals("File could not be read.") || hash.equals("SHA-256 algorithm not found.")) {
            System.out.println("Error: " + hash);
            return;
        }

        FileRecord record = new FileRecord(filePath, hash);
        records.put(filePath, record);

        System.out.println("File registered successfully.");
        System.out.println("Original SHA-256 Hash:");
        System.out.println(hash);
        
        IntegrityLogger.log(
        	    "File Registered: " + filePath +
        	    "\nOriginal Hash: " + hash
        	);
    }

    public void checkFileIntegrity(String filePath) {
        if (!records.containsKey(filePath)) {
            System.out.println("This file has not been registered yet.");
            return;
        }

        FileRecord record = records.get(filePath);
        String oldHash = record.getOriginalHash();
        String newHash = HashGenerator.generateSHA256(filePath);

        System.out.println("Original Hash:");
        System.out.println(oldHash);

        System.out.println("Current Hash:");
        System.out.println(newHash);

        if (oldHash.equals(newHash)) {
            System.out.println("Result: File is safe. No modification detected.");
            
            IntegrityLogger.log(
            	    "File verified successfully.\nFile: " + filePath
            	);
        } else {
            System.out.println("Result: WARNING! File integrity compromised.");
            
            IntegrityLogger.log(
            	    "WARNING! File integrity compromised.\nFile: " + filePath
            	);
        }
        
    }
}