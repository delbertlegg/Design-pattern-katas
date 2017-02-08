package babysitter;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import static babysitter.BabysitterConstants.*;

class BabySitter {
    static final int calculateTotalCharge(LocalTime startTime, LocalTime bedTime,
                                          LocalTime endTime) {
        return handleTimeExceptionsAndCalculate(startTime, bedTime, endTime);

    }

    private static int handleTimeExceptionsAndCalculate(LocalTime startTime, LocalTime bedTime,
                                          LocalTime endTime) {
        return calculateStartToBedPay(adjustedStartTime(startTime), adjustedBedTime(bedTime)) + calculateBedToMidnightPay
                (adjustedBedTime(bedTime)) + calculateMidnightToEndPay(adjustedEndTime(endTime));
    }

    private static LocalTime adjustedEndTime(LocalTime endTime) {
        return endTime.getHour() > NO_LATER_THAN ? LocalTime.of(NO_LATER_THAN, 0) :
                endTime;
    }

    private static LocalTime adjustedBedTime(LocalTime bedTime) {
        return bedTime.getHour() > MIDNIGHT_HOUR ? LocalTime.MAX :
                bedTime;
    }

    private static LocalTime adjustedStartTime(LocalTime startTime) {
        return startTime.getHour() < NO_EARLIER_THAN ? LocalTime.of(NO_EARLIER_THAN, 0) :
                startTime;
    }

    static final int calculateStartToBedPay(LocalTime startTime, LocalTime bedTime) {
        return START_TO_BED_PAY * (int)(startTime.until(bedTime, ChronoUnit.HOURS));
    }

    static final int calculateBedToMidnightPay(LocalTime bedTime) {
        return (bedTime.equals(LocalTime.MAX)) ? 0 :
        BED_TO_MIDNIGHT_PAY * (MIDNIGHT_HOUR - bedTime.getHour());
    }

    static final int calculateMidnightToEndPay(LocalTime endTime) {
        return MIDNIGHT_TO_END_PAY * (int)(LocalTime.MIN.until(endTime, ChronoUnit.HOURS));
    }
}
