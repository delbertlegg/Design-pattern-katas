package composite;

import java.io.File;

/**
 * Created by delle on 2/10/2017.
 */
public interface FileSystemComponent {
    public void add(FileSystemComponent f);
    public int count();
    public String getName();
    public void mkdir(String s);
}
