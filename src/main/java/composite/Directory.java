package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by delle on 2/10/2017.
 */
public class Directory implements FileSystemComponent{
    private List<FileSystemComponent>  subdirectory = new ArrayList<>();
    private String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void mkdir(String s) {
        FileSystemComponent dir = new Directory(s);
        add(dir);
    }

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public void add(FileSystemComponent f) {
        subdirectory.add(f);
    }

    public boolean contains(FileSystemComponent f) {
        return subdirectory.contains(f);
    }

    @Override
    public int count() {
        int totalCount = 0;
        for (FileSystemComponent f : subdirectory) {
            totalCount += f.count();
        }
        return totalCount;
    }
}
