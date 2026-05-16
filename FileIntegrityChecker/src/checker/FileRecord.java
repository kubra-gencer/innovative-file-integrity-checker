package checker;

public class FileRecord {

    private String filePath;
    private String originalHash;

    public FileRecord(String filePath, String originalHash) {
        this.filePath = filePath;
        this.originalHash = originalHash;
    }

    public String getFilePath() {
        return filePath;
    }

    public String getOriginalHash() {
        return originalHash;
    }
}