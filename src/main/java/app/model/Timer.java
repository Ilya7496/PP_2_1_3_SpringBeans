package app.model;

import org.springframework.stereotype.Component;

import java.time.LocalTime;

@Component
public class Timer {

    private final LocalTime startTime;
    public Timer() {
        this.startTime = LocalTime.now();
    }

    public LocalTime getTime() {
        return startTime;
    }
}
