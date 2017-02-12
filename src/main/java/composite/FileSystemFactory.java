package composite;

import java.io.File;

/**
 * Created by delle on 2/10/2017.
 */
public class FileSystemFactory {
    public static FileSystemEntry getComponent(File f) {
        if (f.isDirectory()) {
            return new DirectoryEntry(f);
        }
        else if (f.isFile()) {
            return new FileEntry(f);
        }
        return null;
    }
}
