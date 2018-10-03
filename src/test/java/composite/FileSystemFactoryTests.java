package composite;

import org.junit.*;
import org.mockito.*;

import java.io.File;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class FileSystemFactoryTests {
    FileSystemEntry entry;
    File f = Mockito.mock(File.class);

    @Test
    public void testFactoryReturnsFileWhenFileIsPassed() {
        when(f.isFile()).thenReturn(true);
        entry = FileSystemFactory.getComponent(f);
        assertTrue(entry instanceof FileEntry);
    }

    @Test
    public void testFactoryReturnsDirectoryWhenDirectoryIsPassed() {
        when(f.isDirectory()).thenReturn(true); 
        when(f.listFiles()).thenReturn(new File[]{new File("")});
        entry = FileSystemFactory.getComponent(f);
        assertTrue(entry instanceof DirectoryEntry);
    }
}
