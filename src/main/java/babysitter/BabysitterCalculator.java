package babysitter;

import java.time.LocalTime;

/**
 * Execution: java BabysitterCalculator startTime bedTime endTime
 * All arguments are integers
 * startTime >= 17
 * bedTime <= 24
 * endTime <= 4
 */
public class BabysitterCalculator {
    public static void main (String[] args) {
        LocalTime startTime = LocalTime.of(Integer.parseInt(args[0]), 0);
        LocalTime bedTime = LocalTime.of(Integer.parseInt(args[1]), 0);
        LocalTime endTime = LocalTime.of(Integer.parseInt(args[2]), 0);

        System.out.println("Start time is " + startTime);
        System.out.println("Bed time is " + bedTime);
        System.out.println("End time is " + endTime);
        System.out.println("Total charge is " + BabySitter.calculateTotalCharge(startTime,
                bedTime, endTime));
    }

}
