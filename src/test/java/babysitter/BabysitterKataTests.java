package babysitter;

import org.junit.*;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

import static org.junit.Assert.*;
import static babysitter.BabysitterConstants.*;

public class BabysitterKataTests {
    BabySitter bs;
    final LocalTime startTime = LocalTime.of(17, 0);
    final LocalTime bedTime = LocalTime.of(23, 0);
    final LocalTime endTime = LocalTime.of(4, 0);
    final int startToBed = (int)startTime.until(bedTime, ChronoUnit.HOURS);
    final int bedToMidnight = (MIDNIGHT_HOUR - bedTime.getHour());
    final int midnightToEnd = (int)(LocalTime.MIN.until(endTime, ChronoUnit.HOURS));
    final int totalPay =
            (START_TO_BED_PAY * startToBed)
            + (BED_TO_MIDNIGHT_PAY * bedToMidnight) +
            (MIDNIGHT_TO_END_PAY * midnightToEnd);



    @Test
    public void testPaymentFromStartToBed() {
        assertEquals(START_TO_BED_PAY * startToBed, BabySitter.calculateStartToBedPay
                (startTime, bedTime));
    }

    @Test
    public void testPaymentFromBedToMidnight() {
        assertEquals(BED_TO_MIDNIGHT_PAY * bedToMidnight, BabySitter.calculateBedToMidnightPay
                (bedTime));
    }

    @Test
    public void testPaymentFromMidnightToEnd() {
        assertEquals(MIDNIGHT_TO_END_PAY * midnightToEnd, BabySitter.calculateMidnightToEndPay(endTime));
    }

    @Test
    public void putItAllTogetherMeow() {
        assertEquals(totalPay, BabySitter.calculateTotalCharge(startTime, bedTime, endTime));
    }

    @Test
    public void defaultStartTimeTo17IfEarlier() {
        assertEquals(totalPay, BabySitter.calculateTotalCharge(LocalTime.of(16, 0), bedTime,
                endTime));
    }

    @Test
    public void setBedToMidnightReturnsZeroWhenBedtimeIsAfterMidnight() {
        assertEquals(0, BabySitter.calculateBedToMidnightPay(LocalTime.MAX));
    }

    @Test
    public void defaultEndTimeTo3IfLater() {
        assertEquals(totalPay, BabySitter.calculateTotalCharge(startTime, bedTime,
                LocalTime.of(5, 0)));
    }
}
