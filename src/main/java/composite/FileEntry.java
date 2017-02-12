package composite;

import java.io.File;

/**
 * Created by delle on 2/10/2017.
 */
public class FileEntry implements FileSystemEntry {
    File file;

    public FileEntry(File f) {
        file = f;
    }

    @Override
    public long getCount() {
        return 1;
    }

    @Override
    public long getSize() {
        return file.length();
    }

    public String getName() {
        return file.getName();
    }


}
