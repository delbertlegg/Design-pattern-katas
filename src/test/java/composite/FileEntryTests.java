package composite;

import org.junit.*;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

import java.io.File;

public class FileEntryTests {
    static File file = Mockito.mock(File.class);
    FileEntry entry = new FileEntry(file);

    @BeforeClass
    public static void setUpClass() {
        when(file.length()).thenReturn((long)1000);
        when(file.getName()).thenReturn("Mock");
    }

    @Test
    public void testGetFileSize() {
        assertEquals(1000, entry.getSize());
    }

    @Test
    public void testGetFileName() {
        assertEquals("Mock", entry.getName());
    }
}
