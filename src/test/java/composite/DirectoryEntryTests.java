package composite;

import org.junit.*;
import static org.junit.Assert.*;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Folder with directories and files created in assets for testing
 */
public class DirectoryEntryTests {
	ClassLoader classLoader = getClass().getClassLoader();
	File file = new File(classLoader.getResource("composite-test-folder").getFile());
    DirectoryEntry dir = new DirectoryEntry(file);
    
  

    @Test
    public void testCountReturnsCorrectNumberOfFiles() {
        assertEquals(4, dir.getCount());
    }

    @Test
    public void testGetSizeReturnsCorrectSize() {
        assertEquals(4 * 48, dir.getSize());
    }
}
