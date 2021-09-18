package br.ufrpe.dc.soa;

import javax.jws.WebService;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@WebService(endpointInterface = "br.ufrpe.dc.soa.DateDaysDurationServer")
public class DateDaysDurationServerImplementation implements DateDaysDurationServer {

    /**
     * Calculates the difference in days between two dates
     *
     * @param firstDate string in format yyyy-mm-dd
     * @param secondDate string in format yyyy-mm-dd
     * @return long corresponding to the amount of days between each date
     */
    @Override
    public long daysBetweenDates(String firstDate, String secondDate) {
        LocalDate d1 = LocalDate.parse(firstDate, DateTimeFormatter.ISO_LOCAL_DATE);
        LocalDate d2 = LocalDate.parse(secondDate, DateTimeFormatter.ISO_LOCAL_DATE);
        Duration diff = Duration.between(d2.atStartOfDay(), d1.atStartOfDay());
        return diff.toDays();
    }
}
