package com.techreturners.exercise004;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Exercise004 {
    private LocalDateTime dateTime;

    public Exercise004(LocalDate date) {
        // Test is expecting the class to add 1000000000 seconds to the parameter sent to constructor
        this.dateTime = date.atStartOfDay().plusSeconds(1000000000);
    }

    public Exercise004(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }
}
