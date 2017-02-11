package composite;

import java.io.File;

/**
 * Created by delle on 2/10/2017.
 */
public class DirectoryFile implements FileSystemComponent {
    File file;

    public DirectoryFile(File f) {
        file = f;
    }

    @Override
    public void add(FileSystemComponent f) {
        // do nothing
    }

    @Override
    public int count() {
        return 1;
    }

    @Override
    public String getName() {
        return file.getName();
    }

    @Override
    public void mkdir(String s) {
        // do nothing
    }


}
