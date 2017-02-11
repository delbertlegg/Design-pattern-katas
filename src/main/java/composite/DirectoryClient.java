package composite;

/**
 * Created by delle on 2/10/2017.
 */
public class DirectoryClient {
    public static void main (String[] args) {
        FileDirectoryFactory dir = FileDirectoryFactory.getInstance();
        FileSystemComponent root = dir.getRoot();
    }
}
