package com.techreturners.exercise004;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Exercise004 {
    public static final long GIGASECOND = 1000000000;
    private LocalDateTime dateTime;

    public Exercise004(LocalDate date) {
        this.dateTime = date.atStartOfDay();
    }

    public Exercise004(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    // Given a moment in time set in constructor, this method returns the time after a gigasecond has passed
    public LocalDateTime getDateTime() {
        return dateTime.plusSeconds(GIGASECOND);
    }
}
