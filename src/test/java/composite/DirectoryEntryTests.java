package composite;

import org.junit.*;
import static org.junit.Assert.*;

import java.io.File;

/**
 * Folder with directories and files created in assets for testing
 */
public class DirectoryEntryTests {
    String testDirectory = "/home/elegg/javastuff/design-pattern-katas/assets/composite-test-folder";
    DirectoryEntry dir = new DirectoryEntry(new File(testDirectory));

    @Test
    public void testCountReturnsCorrectNumberOfFiles() {
        assertEquals(4, dir.getCount());
    }

    @Test
    public void testGetSizeReturnsCorrectSize() {
        assertEquals(4 * 48, dir.getSize());
    }
}
