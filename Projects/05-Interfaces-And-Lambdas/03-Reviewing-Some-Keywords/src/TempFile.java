import java.io.File;
import java.io.IOException;

public class TempFile implements AutoCloseable {
    private File file;
    public TempFile(String filename) {
        file = new File(filename);
    }
    
    @Override
    public void close() throws IOException {
        if (file.exists()) {
            if (!file.delete()) {
                throw new IOException("Failed to delete file: " + file.getAbsolutePath());
            }
        }
    }
}