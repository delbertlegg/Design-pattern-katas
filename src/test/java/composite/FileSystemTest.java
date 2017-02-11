package composite;

import org.junit.Test;

import java.io.File;

import static org.junit.Assert.*;

/**
 * Created by delle on 2/10/2017.
 */
public class FileSystemTest {
    Directory rootFolder = new Directory("Root");
    DirectoryFile file = new DirectoryFile(new File("text.txt"));
    Directory subFolder = new Directory("Subfolder");



    @Test
    public void addFileToFolder() {
        rootFolder.add(file);
        assertTrue(rootFolder.contains(file));
    }

    @Test
    public void addFolderToFolder() {
        rootFolder.add(subFolder);
        assertTrue(rootFolder.contains(subFolder));
    }

    @Test
    public void addFileToSubdirectory() {
        rootFolder.add(subFolder);
        subFolder.add(file);
        assertTrue(subFolder.contains(file));
    }

    @Test
    public void countFileInMainFolder() {
        rootFolder.add(file);
        assertEquals(1, rootFolder.count());
    }

    @Test
    public void doNotCountFolder() {
        rootFolder.add(subFolder);
        assertEquals(0, rootFolder.count());
    }

    @Test
    public void countFilesInSubFolders() {
        rootFolder.add(subFolder);
        rootFolder.add(file);
        subFolder.add(file);
        assertEquals(2, rootFolder.count());
    }
}
