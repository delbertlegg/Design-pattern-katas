package composite;

import java.io.File;

/**
 * Created by elegg on 2/12/17.
 */
public class DirectoryCalcSim {
    public static void main (String[] args) {
        System.out.print(DirectoryCalculator.calculate(new File(args[0])));
    }
}
