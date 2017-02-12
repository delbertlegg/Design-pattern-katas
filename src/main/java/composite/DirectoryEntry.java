package composite;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by delle on 2/10/2017.
 */
public class DirectoryEntry implements FileSystemEntry {
    private File file;
    List<FileSystemEntry> entries = new ArrayList<>();
    private int totalCount;
    private long totalSize;

    public DirectoryEntry(File file) {
        this.file = file;
        for (File f : file.listFiles()) {
            entries.add(FileSystemFactory.getComponent(f));
        }
    }

    @Override
    public long getCount() {
        for (FileSystemEntry entry : entries) {
            totalCount += entry.getCount();
        }
        return totalCount;
    }

    @Override
    public long getSize() {
        for (FileSystemEntry entry : entries) {
            totalSize += entry.getSize();
        }
        return totalSize;
    }

    public String getName() {
        return file.getName();
    }
}
