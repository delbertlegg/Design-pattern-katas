package composite;

import java.io.File;

/**
 * Created by elegg on 2/12/17.
 */
public class DirectoryCalculator {
    private static FileSystemEntry entry;
    private static DirectoryCalculator calculator;
    private DirectoryCalculator() {}

    private DirectoryCalculator(File file) {
        if (calculator == null) {
            calculator = new DirectoryCalculator();
        }
        entry = FileSystemFactory.getComponent(file);
    }

    public static String calculate(File f) {
        calculator = new DirectoryCalculator(f);
        StringBuilder sb = new StringBuilder();
        sb.append("Directory: " + entry.getName() + "\n");
        sb.append("Number of files: " + entry.getCount() + "\n");
        sb.append("Total file size: " + entry.getSize() + "\n");
        return sb.toString();
    }
}
