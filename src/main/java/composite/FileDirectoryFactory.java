package composite;

/**
 * Created by delle on 2/10/2017.
 */
public class FileDirectoryFactory {
    private static FileSystemComponent root = new Directory("root");
    private static final FileDirectoryFactory fdf = new FileDirectoryFactory();
    public static FileDirectoryFactory getInstance() {
        return fdf;
    }

    public FileSystemComponent getRoot() {
        return root;
    }
}
